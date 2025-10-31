package sudokumain;

import java.awt.*;
import javax.swing.*;
import javax.swing.SwingUtilities;

/**
 *
 * @author gaat1
 */
public class MenuInicial extends BaseGUI {

    public MenuInicial() {

        super("Menu de Inicio", 700, 600);

        JPanel panel = createPanelPrincipal();
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel titulo = createLabel("MENU INICIAL", 32, Font.BOLD, new Color(33, 33, 33));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(titulo);
        panel.add(Box.createVerticalStrut(50));

        JButton Facil = createBtn("Facil");
        JButton Medio = createBtn("Medio");
        JButton Dificil = createBtn("Dificil");
        JButton Salir = createBtn("Salir");

        panel.add(Facil);
        panel.add(Box.createVerticalStrut(20));
        panel.add(Medio);
        panel.add(Box.createVerticalStrut(20));
        panel.add(Dificil);
        panel.add(Box.createVerticalStrut(20));
        panel.add(Salir);
        panel.add(Box.createVerticalGlue());

        add(panel);

        Facil.addActionListener(e -> {
            SwingUtilities.invokeLater(() -> {

            });
        });
        Medio.addActionListener(e -> {
            SwingUtilities.invokeLater(() -> {

            });
        });
        Dificil.addActionListener(e -> {
            SwingUtilities.invokeLater(() -> {

            });
        });
        Salir.addActionListener(e -> {
            SwingUtilities.invokeLater(() -> {

            });
        });
    }
}
