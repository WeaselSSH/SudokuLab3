package sudokumain;

public abstract class AbstractLogic {

    //constantes
    protected final int TAM = 9;
    protected final int TAM_CAJA = 3;

    //variable
    protected int[][] tablero;

    protected AbstractLogic(int[][] tablero) {
        this.tablero = tablero;
    }

    public final boolean validar() {
        boolean okFilas = validarFilas();
        boolean okColumnas = validarColumnas();
        boolean okCajas = validarCajas();
        boolean sinCeros = sinCeros();
        return okFilas && okColumnas && okCajas && sinCeros;
    }

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

    //estas funciones se heredaran en logicasudoku
    protected abstract boolean validarFilas();

    protected abstract boolean validarColumnas();

    protected abstract boolean validarCajas();

    //por si acaso
    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] nuevoTablero) {
        this.tablero = nuevoTablero;
    }
}
