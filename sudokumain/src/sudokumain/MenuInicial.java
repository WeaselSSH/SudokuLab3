package sudokumain;

import java.awt.*;
import javax.swing.*;

public class MenuInicial extends BaseGUI {

    public MenuInicial() {
        super("Menu de Inicio", 700, 600);

        JPanel panel = createPanelPrincipal();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        JLabel titulo = createLabel("MENU INICIAL", 26, Font.BOLD, new Color(33, 33, 33));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton btnFacil = createBtn("Facil");
        JButton btnMedio = createBtn("Medio");
        JButton btnDificil = createBtn("Dificil");
        JButton btnSalir = createBtn("Salir");
        for (JButton b : new JButton[]{btnFacil, btnMedio, btnDificil, btnSalir}) {
            b.setAlignmentX(Component.CENTER_ALIGNMENT);
        }

        panel.add(titulo);
        panel.add(Box.createVerticalGlue());
        panel.add(btnFacil);
        panel.add(Box.createVerticalStrut(12));
        panel.add(btnMedio);
        panel.add(Box.createVerticalStrut(12));
        panel.add(btnDificil);
        panel.add(Box.createVerticalStrut(12));
        panel.add(btnSalir);
        panel.add(Box.createVerticalGlue());

        btnFacil.addActionListener(e -> {
            new PantallaSudoku('F');
            dispose();
        });
        btnMedio.addActionListener(e -> {
            new PantallaSudoku('M');
            dispose();
        });
        btnDificil.addActionListener(e -> {
            new PantallaSudoku('D');
            dispose();
        });
        btnSalir.addActionListener(e -> dispose());

        add(panel);
        setVisible(true);
    }
}
