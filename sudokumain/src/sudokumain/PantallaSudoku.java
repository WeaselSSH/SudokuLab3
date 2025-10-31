package sudokumain;

import java.awt.*;
import javax.swing.*;

public class PantallaSudoku extends BaseGUI {

    private char dificultad;
    private int[][] tableroInicial;
    private JTextField[][] celdas;
    
    public PantallaSudoku(char dificultad) {
        super("Sudoku", 1000, 700);
        this.dificultad = dificultad;
        this.tableroInicial = generarTablero();
        
        celdas = new JTextField[9][9];
        ResaltarCeldas resaltar = new ResaltarCeldas(celdas, new Color(247, 181, 189), Color.white);
        
        JPanel panel = createPanelPrincipal();
        panel.setLayout(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        
        JLabel titulo = createLabel("Sudoku", 26, Font.BOLD, new Color(33, 33, 33));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titulo, BorderLayout.NORTH);
        
        JPanel tableroPanel = new JPanel(new GridLayout(9, 9, 1, 1));
        tableroPanel.setOpaque(false);
        tableroPanel.setBorder(BorderFactory.createLineBorder(new Color(80, 80, 80), 2));
        
        for (int fila = 0; fila < 9; fila++) {
            for (int col = 0; col < 9; col++) {
                JTextField celda = createTextField();
                celda.setHorizontalAlignment(JTextField.CENTER);
                celda.setFont(new Font("SansSerif", Font.BOLD, 20));
                celda.setPreferredSize(new Dimension(55, 55));
                celda.setBackground(Color.WHITE);
                celdas[fila][col] = celda;
                celda.addFocusListener(new java.awt.event.FocusAdapter() {
                    @Override
                    public void focusGained(java.awt.event.FocusEvent e) {
                        SwingUtilities.invokeLater(() -> resaltar.colorearPor(celda));
                    }
                });
                celda.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent e) {
                        celda.requestFocusInWindow();
                        resaltar.colorearPor(celda);
                    }
                });
                int[] b = bordePara(fila, col);
                celda.setBorder(BorderFactory.createMatteBorder(b[0], b[1], b[2], b[3], new Color(100, 100, 100)));
                tableroPanel.add(celda);
            }
        }
        
        cargarTablero(tableroInicial);
        
        JButton btnSalir = createBtn("Regresar");
        JButton btnVerificar = createBtn("Verificar");
        JButton btnReiniciar = createBtn("Reiniciar");
        JButton btnNuevo = createBtn("Nuevo Tablero");
        
        btnSalir.addActionListener(e -> {
            this.dispose();
            new MenuInicial().setVisible(true);
        });
        btnReiniciar.addActionListener(e -> cargarTablero(tableroInicial));
        btnVerificar.addActionListener(e -> verificar());
        btnNuevo.addActionListener(e -> {
            tableroInicial = generarTablero();
            cargarTablero(tableroInicial);
        });
        
        JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        botonesPanel.setOpaque(false);
        botonesPanel.add(btnSalir);
        botonesPanel.add(btnVerificar);
        botonesPanel.add(btnReiniciar);
        botonesPanel.add(btnNuevo);
        
        panel.add(tableroPanel, BorderLayout.CENTER);
        panel.add(botonesPanel, BorderLayout.SOUTH);
        add(panel);
        setVisible(true);
    }
    
    private void cargarTablero(int[][] t) {
        for (int f = 0; f < 9; f++) {
            for (int c = 0; c < 9; c++) {
                int v = t[f][c];
                JTextField tf = celdas[f][c];
                if (v == 0) {
                    tf.setText("");
                    tf.setEditable(true);
                    tf.setForeground(Color.BLACK);
                } else {
                    tf.setText(String.valueOf(v));
                    tf.setEditable(false);
                    tf.setForeground(new Color(30, 30, 30));
                }
                tf.setBackground(Color.WHITE);
            }
        }
    }
    
    private int[][] leerTableroActual() {
        int[][] t = new int[9][9];
        for (int f = 0; f < 9; f++) {
            for (int c = 0; c < 9; c++) {
                String s = celdas[f][c].getText().trim();
                if (s.isEmpty()) {
                    t[f][c] = 0;
                } else {
                    try {
                        t[f][c] = Integer.parseInt(s);
                    } catch (NumberFormatException ex) {
                        t[f][c] = 0;
                    }
                }
            }
        }
        return t;
    }
    
    private void verificar() {
        int[][] t = leerTableroActual();
        LogicaSudoku logica = new LogicaSudoku(t);
        boolean ok = logica.validar();
        JOptionPane.showMessageDialog(this, ok ? "Tablero correcto" : "Tablero inválido");
    }
    
    private int[][] generarTablero() {
        switch (Character.toUpperCase(dificultad)) {
            case 'F':
                return Tableros.randomFacil();
            case 'M':
                return Tableros.randomMedio();
            case 'D':
                return Tableros.randomDificil();
            default:
                return Tableros.randomFacil();
        }
    }
    
    private int[] bordePara(int fila, int col) {
        int g = 3, f = 1;
        int top = (fila == 0) ? g : (fila % 3 == 0 ? g : f);
        int left = (col == 0) ? g : (col % 3 == 0 ? g : f);
        int bottom = (fila == 8) ? g : f;
        int right = (col == 8) ? g : f;
        return new int[]{top, left, bottom, right};
    }
}
