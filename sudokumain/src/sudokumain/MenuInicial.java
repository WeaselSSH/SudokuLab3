package sudokumain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;




/**
 *
 * @author gaat1
 */
public class MenuInicial extends BaseGUI{
    
    public MenuInicial(){
        
        super("Menu de Inicio", 400, 600);

        JPanel panel = new JPanel();
        JButton Facil = createBtn("Facil");
    
        JButton Medio = createBtn("Medio");
        
        
        JButton Dificil = createBtn("Dificil");
        JButton Salir = createBtn("Salir");
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        Facil.setAlignmentX(Component.CENTER_ALIGNMENT);
        Medio.setAlignmentX(Component.CENTER_ALIGNMENT);
        Dificil.setAlignmentX(Component.CENTER_ALIGNMENT);
        Salir.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(panel);
        panel.add(Box.createVerticalGlue());
        panel.add(Facil);
        panel.add(Box.createVerticalStrut(10));
        panel.add(Medio);
        panel.add(Box.createVerticalStrut(10));
        panel.add(Dificil);
        panel.add(Box.createVerticalStrut(10));
        panel.add(Salir);
        panel.add(Box.createVerticalGlue());
        
        
        Facil.addActionListener(e ->{ 
            SwingUtilities.invokeLater(()->{
              
            }); 
        });
        Medio.addActionListener(e ->{ 
            SwingUtilities.invokeLater(()->{
              
            }); 
        });
        Dificil.addActionListener(e ->{ 
            SwingUtilities.invokeLater(()->{
              
            }); 
        });
        Salir.addActionListener(e ->{ 
            SwingUtilities.invokeLater(()->{
              
            }); 
        });
    }
}
