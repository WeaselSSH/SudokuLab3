package sudokumain;

import javax.swing.JButton;
import java.awt.Color;

public class ResaltarCeldas {
  //proposito: Cuando se presione una celda, se resalte toda la columna y fila en la que se encuentra, tipo cruz.
    JButton[][] celdas; //los botones del tablero
    private Color colorFila = new Color(247,181,189);
    private Color colorColumna = new Color(247,219,181);
    private Color colorBloque = new Color(247,181,212); //esto va a resaltar el bloque donde se encuentra la celda.
    private Color colorDefault = Color.white;
    
   //constructor
    public ResaltarCeldas (JButton[][]celdas){
        this.celdas=celdas;
    }
    
    //metodo - se encarga de por default colorear las celdas de blanco.
    public void limpiarCeldas(){
        //para que recorra todas las filas
        for (int i=0; i<9; i++){
            //para que recorra todas las columnas
            for (int j=0;i<9; j++){
                celdas[i][j].setBackground(colorDefault);
                celdas[i][j].setOpaque(true); //se encarga de que se pinte complementamente y no queda transparente.
            }
        }
    }
    
    //metodo principal
    public void colorearCeldas(){
        limpiarCeldas();
        
    }
}
