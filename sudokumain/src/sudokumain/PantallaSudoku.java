package sudokumain;

import java.awt.*;
import javax.swing.*;

public class PantallaSudoku extends BaseGUI {

    private final int[][] tableroInicial;

    public PantallaSudoku(int[][] tableroInicial) {
        super("Sudoku", 1000, 700);
        this.tableroInicial = tableroInicial;

        JTextField[][] celdas = new JTextField[9][9];
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
                int v = tableroInicial[fila][col];
                if (v != 0) {
                    celda.setText(String.valueOf(v));
                    celda.setEditable(false);
                    celda.setForeground(new Color(30, 30, 30));
                }
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

        JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        botonesPanel.setOpaque(false);
        botonesPanel.add(createBtn("Salir"));
        botonesPanel.add(createBtn("Verificar"));
        botonesPanel.add(createBtn("Reiniciar"));

        panel.add(tableroPanel, BorderLayout.CENTER);
        panel.add(botonesPanel, BorderLayout.SOUTH);
        add(panel);
        setVisible(true);
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
