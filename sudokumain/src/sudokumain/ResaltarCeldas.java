package sudokumain;

import java.awt.Color;
import javax.swing.JTextField;

public class ResaltarCeldas {

    private final JTextField[][] celdas;
    private final Color colorCeldas;
    private final Color colorDefault;

    public ResaltarCeldas(JTextField[][] celdas, Color colorCeldas, Color colorDefault) {
        this.celdas = celdas;
        this.colorCeldas = colorCeldas;
        this.colorDefault = colorDefault;
    }

    public void limpiar() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (celdas[i][j] != null) {
                    celdas[i][j].setBackground(colorDefault);
                    celdas[i][j].setOpaque(true);
                }
            }
        }
    }

    public void colorear(int fila, int columna) {
        limpiar();
        for (int j = 0; j < 9; j++) {
            if (celdas[fila][j] != null) {
                celdas[fila][j].setBackground(colorCeldas);
                celdas[fila][j].setOpaque(true);
            }
        }
        for (int i = 0; i < 9; i++) {
            if (celdas[i][columna] != null) {
                celdas[i][columna].setBackground(colorCeldas);
                celdas[i][columna].setOpaque(true);
            }
        }
        int inicioFila = (fila / 3) * 3;
        int inicioColumna = (columna / 3) * 3;
        for (int i = inicioFila; i < inicioFila + 3; i++) {
            for (int j = inicioColumna; j < inicioColumna + 3; j++) {
                if (celdas[i][j] != null) {
                    celdas[i][j].setBackground(colorCeldas);
                    celdas[i][j].setOpaque(true);
                }
            }
        }
    }

    public void colorearPor(JTextField celda) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (celdas[i][j] == celda) {
                    colorear(i, j);
                    return;
                }
            }
        }
    }
}
