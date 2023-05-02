/**
 superclase abstracta para Snicker y Super8, subclase de Producto
 */
abstract class Dulce extends Producto{

    /** constructor el cual recibe la serie de la bebida
     *
     * @param serie
     */

    public Dulce(int serie) {
        super(serie);
    }

    /** subclase de Dulce
     *
     */
}
class Snicker extends Dulce{

    /** constructor el cual recibe la serie de Snicker
     *
     * @param serie
     */
    public Snicker(int serie)
    {
        super(serie);
    }

    /** metodo para obtener el nombre del dulce con un getter
     *
     * @return snicker
     */

    public String getnombre() {
        return "snicker";
    }
}

/** subclase de Dulce
 *
 */
class Super8 extends Dulce {

    /** constructor el cual recibe la serie de Super8
     *
     * @param serie
     */

    public Super8(int serie)
    {
        super(serie);
    }

    /** constructor el cual recibe la serie de Super8
     *
     * @return Super8
     */
    public String getnombre() {

        return "super8";
    }
}