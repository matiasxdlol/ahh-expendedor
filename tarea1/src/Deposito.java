import java.util.ArrayList;

class Deposito {
    private ArrayList<Bebida> al;

    public Deposito() {
        al = new ArrayList<>();
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
class DepositoM {
    private ArrayList<Moneda> mon;

    public DepositoM() {
        mon = new ArrayList();
    }

    public void addMoneda(Moneda b) {
        mon.add(b);
    }

    public Moneda getMoneda() {
        if (mon.size() == 0) return null;

        Moneda b = mon.remove(0);
        return b;
    }
}

