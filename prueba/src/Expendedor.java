import java.util.HashMap;
import java.util.Map;

public class Expendedor {
    private final Deposito<Bebida> bebidas;
    private final Deposito<Dulce> dulces;
    private final DepositoM monedasVuelto;
    private final int precioBebida;
    private final int precioDulce;

    public Expendedor(int cantidadInicial, int precioBebida, int precioDulce) {
        this.bebidas = new Deposito<>(cantidadInicial);
        this.dulces = new Deposito<>(cantidadInicial);
        this.monedasVuelto = new DepositoM();
        this.precioBebida = precioBebida;
        this.precioDulce = precioDulce;

        for (int i = 0; i < cantidadInicial; i++) {
            this.bebidas.addProducto(new CocaCola());
            this.bebidas.addProducto(new Sprite());
            this.dulces.addProducto(new Snickers());
            this.dulces.addProducto(new Super8());
        }
    }

    public Producto comprar(Moneda moneda, int deposito) throws PagoIncorrectoException, NoHayProductoException {
        if (moneda == null) {
            throw new PagoIncorrectoException("Debe ingresar una moneda válida.");
        }

        int valorMoneda = moneda.getValor();

        if (deposito == Deposito.BEBIDAS) {
            if (valorMoneda >= this.precioBebida) {
                Bebida bebida = this.bebidas.getProducto(deposito);
                if (bebida != null) {
                    int cambio = valorMoneda - this.precioBebida;
                    this.entregarVuelto(cambio);
                    return bebida;
                }
            }
        } else if (deposito == Deposito.DULCES) {
            if (valorMoneda >= this.precioDulce) {
                Dulce dulce = this.dulces.getProducto(deposito);
                if (dulce != null) {
                    int cambio = valorMoneda - this.precioDulce;
                    this.entregarVuelto(cambio);
                    return dulce;
                }
            }
        }

        this.monedasVuelto.addMoneda(moneda);
        throw new NoHayProductoException("No hay producto disponible en el depósito indicado.");
    }

    public int getPrecioBebida() {
        return this.precioBebida;
    }

    public int getPrecioDulce() {
        return this.precioDulce;
    }

    public Moneda getMonedaVuelto() {
        return this.monedasVuelto.getMoneda();
    }

    private void entregarVuelto(int cambio) {
        for (int valor : DepositoM.VALORES_MONEDAS) {
            while (cambio >= valor) {
                Moneda moneda = DepositoM.crearMoneda(valor);
                this.monedasVuelto.addMoneda(moneda);
                cambio -= valor;
            }
        }
    }
}
