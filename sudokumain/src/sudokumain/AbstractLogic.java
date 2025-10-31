package sudokumain;

public abstract class AbstractLogic {

    protected int[][] tablero;
    protected boolean filasOK;
    protected boolean columnasOK;
    protected boolean cajasOK;
    protected boolean ganado;

    public abstract void juegoGanado();

    public abstract void columnaValida();

    public abstract void cajaValida();

    public abstract void filaValida();
}
