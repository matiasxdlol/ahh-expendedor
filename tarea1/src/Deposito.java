import java.util.ArrayList;

class Deposito<T> {
    private ArrayList<T> al;

    public Deposito() {
        al = new ArrayList<T>();
    }

    public void addBebida(Bebida b) {
        al.add(b);
    }

    public Bebida getBebida() {

        if (al.size() == 0) return null;

        Bebida b = al.remove(0);
        return b;
    }
}
class DepositoV<T> {
    private ArrayList<T> mon;

    public DepositoV() {
        mon = new ArrayList<T>();
    }

    public void addMoneda(T Moneda) {
        mon.add(b);
    }

    public T getMoneda() {
        if (mon.size() == 0) return null;

        Moneda b = mon.remove(0);
        return b;
    }
}

