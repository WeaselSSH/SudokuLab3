package sudokumain;


import javax.swing.JComboBox;
import javax.swing.JFrame;


/**
 *
 * @author gaat1
 */
public class MenuInicial extends JFrame{
    public MenuInicial(){
        setTitle("Gestion de empleados");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        String[] Dificultades = {"Facil","Medio","Dificil"};
        JComboBox<String> comboDificultad = new JComboBox<>(Dificultades);
        comboDificultad.setBounds(50, 50, 150, 25);
        
       add(comboDificultad);
    }
}
