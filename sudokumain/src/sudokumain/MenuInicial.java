package sudokumain;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;




/**
 *
 * @author gaat1
 */
public class MenuInicial{
    public MenuInicial(){
        BaseGUI frame = new BaseGUI("Menu inicial", 300,300);
        JPanel panel = frame.createPanelPrincipal();
        JButton Facil = frame.createBtn("Facil");
        JButton Medio = frame.createBtn("Medio");
        JButton Dificil = frame.createBtn("Dificil");
        JButton Salir = frame.createBtn("Salir");
        frame.add(panel);
        panel.add(Facil);
        panel.add(Medio);
        panel.add(Dificil);
        panel.add(Salir);
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
