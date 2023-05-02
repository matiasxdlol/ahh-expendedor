
/**
superclase abstracta para CocaCola y Sprite
 */
abstract class Bebida extends Producto{

/**
 constructor el cual recibe la serie de la bebida
 */
    public Bebida(int serie) {
        super(serie);
    }


}

/** subclase de bebida
 *
 */
class CocaCola extends Bebida {

    /** constructor el cual recibe la serie de cocacola
     *
     * @param serie
     */


    public CocaCola(int serie)
    {
        super(serie);
    }

    /** metodo para obtener el nombre de la bebida con un getter
     *
     * @return cocacola
     */
    public String getnombre() {
        return "cocacola";
    }
}

/** subclase de bebida
 *
 */
class Sprite extends Bebida  {

    /** constructor el cual recibe la serie de sprite
     *
     * @param serie
     */
    public Sprite(int serie)
    {
        super(serie);
    }

    public String getnombre() {

        /** metodo para obtener el nombre de la bebida con un getter
         *
         * @return sprite
         */

        return "sprite";
    }
}

