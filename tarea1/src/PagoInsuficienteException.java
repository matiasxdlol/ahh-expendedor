/** clase para la exepción en caso de que el que el valor ingresado sea inferior
 * al solicitado
 */
public class PagoInsuficienteException extends Exception{

    /** constructor el cual recibe la exepción si es que el valor ingresado es inferior
     * al solicitado
     *
     * @param noalcanza
     */
    public PagoInsuficienteException(String noalcanza){
        super(noalcanza);
    }
}
