abstract class Bebida extends Producto{

    public Bebida(int serie) {
        super(serie);
    }


}
class CocaCola extends Bebida {
    public CocaCola(int serie)
    {
        super(serie);
    }

    public String getnombre() {
        return "cocacola";
    }
}
class Sprite extends Bebida  {
    public Sprite(int serie)
    {
        super(serie);
    }

    public String getnombre() {

        return "sprite";
    }
}

