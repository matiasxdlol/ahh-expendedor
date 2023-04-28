abstract class Dulce {

    private int serie;

    public Dulce(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public abstract String comer();
}

class Snicker extends Dulce {
    public Snicker(int s) {
        super(s);
    }

    public String comer() {
        return "snicker";
    }
}

class Super8 extends Dulce {
    public Super8(int s) {
        super(s);
    }

    public String comer() {
        return "super8";
    }
}
