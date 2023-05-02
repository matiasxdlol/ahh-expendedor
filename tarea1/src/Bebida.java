
/**
superclase abstracta para CocaCola y Sprite
 */
abstract class Bebida extends Producto{

/**
constructor de bebida para ver si es cocacola o sprite
 */
    public Bebida(int serie) {
        super(serie);
    }


}

/** subclase de bebida
 *
 */
class CocaCola extends Bebida {

    /** constructor de cocacola
     *
     * @param serie
     */


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

