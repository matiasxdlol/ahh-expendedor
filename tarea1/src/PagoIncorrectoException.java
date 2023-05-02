public class PagoIncorrectoException extends NullPointerException{
    public PagoIncorrectoException(String pagoinvalido){
        super(pagoinvalido);
    }
}
