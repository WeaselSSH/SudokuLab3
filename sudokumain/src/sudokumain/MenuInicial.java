package sudokumain;

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
        JPanel panel = createPanelPrincipal();
        JButton Facil = createBtn("Facil");
        JButton Medio = createBtn("Medio");
        JButton Dificil = createBtn("Dificil");
        JButton Salir = createBtn("Salir");
        add(panel);
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
