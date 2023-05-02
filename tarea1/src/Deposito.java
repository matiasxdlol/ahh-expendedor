import java.util.ArrayList;

/** clase que almacena productos
 *
 * @param <T>
 */

class Deposito<T> {

    /** parametro que declara un arreglo al.
     *
     */
    private ArrayList<T> al;

    /** constructor que crea el arreglo de los productos
     *
     */

    public Deposito() {
        al = new ArrayList<T>();
    }

    /** metodo que agrega productos al arreglo
     *
     * @param producto
     */

    public void addProducto(T producto) {
        al.add(producto);
    }

    /** metodo que saca productos del arreglo
     *
     * @return
     */

    public T getProducto() {

        if (al.size() == 0) return null;

        T b = al.remove(0);
        return b;
    }
}

/** clase que almacena monedas para el vuelto
 *
 * @param <T>
 */
class DepositoV<T> {

    /** parametro que crea un arreglo mon
     *
     */
    private ArrayList<T> mon;

    /** constructor para realizar el vuelto
     *
     */
    public DepositoV() {
        mon = new ArrayList<T>();
    }

    /** metodo que agrega monedas al deposito
     *
     * @param moneda
     */
    public void addMoneda(T moneda) {
        mon.add(moneda);
    }

    /** metodo que saca monedas del deposito
     *
     */
    public T getMoneda() {
        if (mon.size() == 0) return null;

        T moneda = mon.remove(0);
        return moneda;
    }
}

