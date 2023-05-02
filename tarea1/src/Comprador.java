/**
 * clase para el comprador del producto
 */
class Comprador {

    private String sabor;

    private int exp;

    private int vuelto;

    /** exepción para pago insuficiente y en caso de que no haya producto
     *
     *
     * @param m
     * @param cualBebida
     * @param exp
     * @throws PagoInsuficienteException
     * @throws NoHayProductoExcption
     */

    public Comprador(Moneda m, int cualBebida, Expendedor exp) throws PagoInsuficienteException, NoHayProductoExcption{

        Producto a = exp.comprarBebida(m, cualBebida);

        if (a == null) sabor = null;
        else sabor = a.getnombre();

        boolean b = true;
        while (b) {

            Moneda s = exp.getVuelto();
            if (s != null) vuelto += s.getValor();
            else b = false;

        }
    }

    /** metodo que retorna vuelto
     *
     * @return vuelto
     */

    public int Vuelto() {
        return vuelto;
    }

    /** metodo qye retorna el sabor del producto
     *
     * @return sabor
     */
    public String ComisteBebiste() {
        return sabor;
    }
}