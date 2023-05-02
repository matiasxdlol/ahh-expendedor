/** superclase abstracta para monedas
 *
 */
abstract class Moneda {
    public Moneda() {
    }

    /** metodo para obtener serie por medio de getter
     *
     * @return moneda
     */
    public Moneda getSerie() {
        return this;
    }

    /** metodo abstracto para obtener el valor
     *
     * @return valor
     */

    public abstract int getValor();

}