package sudokumain;

import java.awt.Color;
import javax.swing.JTextField;

public class ResaltarCeldas {
    
  //proposito: Cuando se presione una celda, se resalte toda la columna y fila en la que se encuentra, tipo cruz.
    JTextField[][] celdas; //los botones del tablero
    
    private Color colorCeldas;
    private Color colorDefault;
    
   //constructor
    public ResaltarCeldas (JTextField[][]celdas, Color colorCeldas, Color colorDefault){
        this.celdas=celdas;
        this.colorCeldas=colorCeldas;
        this.colorDefault=colorDefault;
    }
    
    //metodo - se encarga de por default colorear las celdas de blanco.
    public void limpiarCeldas(){
        //para que recorra todas las filas
        for (int i=0; i<9; i++){
            //para que recorra todas las columnas
            for (int j=0;j<9; j++){
                if (celdas[i][j]!= null){
                celdas[i][j].setBackground(colorDefault);
                celdas[i][j].setOpaque(true); //se encarga de que se pinte complementamente y no queda transparente.
            }
        }
    }
    }
    
    //metodo principal
    public void colorearCeldas(int fila, int columna){
        limpiarCeldas();
        for (int j=0; j<9; j++){
            celdas[fila][j].setBackground(colorCeldas);
            celdas[fila][j].setOpaque(true);
   
        }
            for (int i=0; i<9; i++){
                celdas[i][columna].setBackground(colorCeldas);
                celdas[i][columna].setOpaque(true);
            }
            
            int inicioFila = (fila /3)*3;
            int inicioColumna = (columna / 3)*3;
            for (int i = inicioFila; i< inicioFila + 3; i++){
                for (int j = inicioColumna; j<inicioColumna +3; j++){
                    celdas[i][j].setBackground(colorCeldas);
                    celdas[i][j].setOpaque(true);
                   
                }
            }
            
    }
}
