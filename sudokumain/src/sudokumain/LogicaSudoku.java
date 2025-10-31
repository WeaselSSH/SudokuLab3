package sudokumain;

public class LogicaSudoku extends AbstractLogic {

    public LogicaSudoku(int[][] tablero) {
        super(tablero);
    }

    @Override
    protected boolean validarFilas() {
        for (int f = 0; f < TAM; f++) {
            boolean[] numeroVisto = new boolean[TAM + 1];
            for (int c = 0; c < TAM; c++) {
                int valorCelda = tablero[f][c];
                if (valorCelda == 0) {
                    continue;
                }
                if (valorCelda < 1 || valorCelda > TAM || numeroVisto[valorCelda]) {
                    return false;
                }
                numeroVisto[valorCelda] = true;
            }
        }
        return true;
    }

    @Override
    protected boolean validarColumnas() {
        for (int c = 0; c < TAM; c++) {
            boolean[] numeroVisto = new boolean[TAM + 1];
            for (int f = 0; f < TAM; f++) {
                int valorCelda = tablero[f][c];
                if (valorCelda == 0) {
                    continue;
                }
                if (valorCelda < 1 || valorCelda > TAM || numeroVisto[valorCelda]) {
                    return false;
                }
                numeroVisto[valorCelda] = true;
            }
        }
        return true;
    }

    @Override
    protected boolean validarCajas() {
        for (int inicioFilaCaja = 0; inicioFilaCaja < TAM; inicioFilaCaja += TAM_CAJA) {
            for (int inicioColumnaCaja = 0; inicioColumnaCaja < TAM; inicioColumnaCaja += TAM_CAJA) {
                boolean[] numeroVisto = new boolean[TAM + 1];
                for (int desplazamientoFila = 0; desplazamientoFila < TAM_CAJA; desplazamientoFila++) {
                    for (int desplazamientoColumna = 0; desplazamientoColumna < TAM_CAJA; desplazamientoColumna++) {
                        int fila = inicioFilaCaja + desplazamientoFila;
                        int columna = inicioColumnaCaja + desplazamientoColumna;
                        int valorCelda = tablero[fila][columna];
                        if (valorCelda == 0) {
                            continue;
                        }
                        if (valorCelda < 1 || valorCelda > TAM || numeroVisto[valorCelda]) {
                            return false;
                        }
                        numeroVisto[valorCelda] = true;
                    }
                }
            }
        }
        return true;
    }

    @Override
    protected boolean sinCeros() {
        for (int fila = 0; fila < TAM; fila++) {
            for (int col = 0; col < TAM; col++) {
                if (tablero[fila][col] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
