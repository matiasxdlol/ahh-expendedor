abstract class Bebida {

    /**
     * test !!!!
     */
    private int serie;

    public Bebida(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public abstract String beber();
}
class CocaCola extends Bebida {
    public CocaCola(int s) {
        super(s);
    }

    public String beber() {
        return "cocacola";
    }
}
class Sprite extends Bebida  {
    public Sprite(int s) {
        super(s);
    }

    public String beber() {
        return "sprite";
    }
}

