import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5, 300);
        Comprador c = null;
        Moneda m = null;


        try {
            m = new Moneda100();
            c = new Comprador(m, 1, exp);
            System.out.println("Bebida " + c.ComisteBebiste() + " tu vuelto es de " + c.Vuelto());
            m = new Moneda500();
            c = new Comprador(m, 2, exp);
            System.out.println("Bebida " + c.ComisteBebiste() + " tu vuelto es de " + c.Vuelto());
            m = new Moneda1000();
            c = new Comprador(m, 3, exp);
            System.out.println("Dulce " + c.ComisteBebiste() + " tu vuelto es de " + c.Vuelto());
            m = new Moneda1000();
            c = new Comprador(m, 4, exp);
            System.out.println("Dulce " + c.ComisteBebiste() + " tu vuelto es de " + c.Vuelto());
        }
        catch (PagoInsuficienteException INS) {
            System.out.println("No le alcanza, " + "tenga su devolucion "+c.Vuelto() );
        }
        catch (NoHayProductoExcption noHay){
            System.out.println("No queda el dulce o bebida elegido,"+"devolucion "+c.Vuelto() );
        }
        catch (PagoIncorrectoException ErrorEnPago){
            System.out.println("Error en su pago, intente nuevamente");
        }
    }}