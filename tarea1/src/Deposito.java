import java.util.ArrayList;

class Deposito<T> {
    private ArrayList<T> al;

    public Deposito() {
        al = new ArrayList<T>();
    }

    public void addProducto(T producto) {
        al.add(producto);
    }

    public T getProducto() {

        if (al.size() == 0) return null;

        T b = al.remove(0);
        return b;
    }
}
class DepositoV<T> {
    private ArrayList<T> mon;

    public DepositoV() {
        mon = new ArrayList<T>();
    }

    public void addMoneda(T moneda) {
        mon.add(moneda);
    }

    public T getMoneda() {
        if (mon.size() == 0) return null;

        T moneda = mon.remove(0);
        return moneda;
    }
}

