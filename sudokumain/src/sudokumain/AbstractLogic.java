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
        boolean tableroCompleto = sinCeros();
        return okFilas && okColumnas && okCajas && tableroCompleto;
    }

    //estas funciones se heredaran en logicasudoku
    protected abstract boolean sinCeros();

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
