/** clase para la exepción en caso de que el pago del producto sea invalido
 *
 */
public class PagoIncorrectoException extends NullPointerException{

    /**
     * constructor el cual recibe la exepción si es que el pago es invalido
     *
     * @param pagoinvalido
     */
    public PagoIncorrectoException(String pagoinvalido){
        super(pagoinvalido);
    }
}
