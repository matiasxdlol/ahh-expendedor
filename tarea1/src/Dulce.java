abstract class Dulce extends Producto{

    public Dulce(int serie) {
        super(serie);
    }


}
class Snicker extends Dulce{
    public Snicker(int serie)
    {
        super(serie);
    }

    public String getnombre() {
        return "snicker";
    }
}
class Super8 extends Dulce {
    public Super8(int serie)
    {
        super(serie);
    }

    public String getnombre() {

        return "super8";
    }
}