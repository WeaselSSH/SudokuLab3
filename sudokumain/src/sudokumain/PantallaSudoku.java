/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudokumain;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author andre
 */
public class PantallaSudoku extends BaseGUI {

    public PantallaSudoku() {

        super("Sudoku", 1000, 700);

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
                celda.setBorder(BorderFactory.createLineBorder(new Color(150, 150, 150), 1)); // 🔹 líneas más finas

                int top = 1, left = 1, bottom = 1, right = 1;
                if (fila % 3 == 0 && fila != 0) {
                    top = 2;
                }
                if (col % 3 == 0 && col != 0) {
                    left = 2;
                }
                if (fila == 8) {
                    bottom = 2;
                }
                if (col == 8) {
                    right = 2;
                }
                JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
                botonesPanel.setOpaque(false);

                JButton btnSalir = createBtn("Salir");
                JButton btnVerificar = createBtn("Verificar");
                JButton btnReiniciar = createBtn("Reiniciar");

                botonesPanel.add(btnSalir);
                botonesPanel.add(btnVerificar);
                botonesPanel.add(btnReiniciar);

                panel.add(botonesPanel, BorderLayout.SOUTH);
                celda.setBorder(BorderFactory.createMatteBorder(top, left, bottom, right, new Color(100, 100, 100)));

                tableroPanel.add(celda);

                add(panel);
                setVisible(true);
            }
        }

        panel.add(tableroPanel, BorderLayout.CENTER);
    }

}
