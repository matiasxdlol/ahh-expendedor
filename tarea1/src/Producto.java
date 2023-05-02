/**
superclase de bebida
 */
abstract class Producto {
    private int serie;

    /**
     * constructor el cual recibe la serie del producto
     * @param serie
     */
    public Producto(int serie){
        this.serie=serie;
    }

    /** metodo que retorna la serie con getter
     *
     */

    public int getSerie(){
        return serie;
    }

    /** metodo abstracto que toma el nombre del producto con un getter
     *
     */

    public abstract String getnombre();

}
