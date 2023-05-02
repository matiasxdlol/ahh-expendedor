/** clase para la exepción en el caso de que no hayan productos
 *
 */
public class NoHayProductoExcption extends Exception{

    /** constructor el cual recibe la exepción si es que no hay producto
     *
     * @param NoHay
     */
    public NoHayProductoExcption(String NoHay){
        super(NoHay);
    }
}
