/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudokumain;

import javax.swing.SwingUtilities;

/**
 *
 * @author DELL
 */
public class Sudokumain{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
              MenuInicial ventana = new MenuInicial();
               ventana.setVisible(true);
            }); 
    }
}
