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
        super("Sudoku", 600, 500);
        JPanel panel = createPanelPrincipal();
        panel.setLayout(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JLabel titulo = createLabel("Sudoku", 22, Font.BOLD, new Color(33, 33, 33));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titulo, BorderLayout.NORTH);
    }

}
