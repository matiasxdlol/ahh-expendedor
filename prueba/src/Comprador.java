class Comprador {
    private String sabor;
    private int totalMonedas;

    public Comprador(Moneda m, int numProducto, Expendedor expendedor) {
        Producto producto = null;

        if (numProducto == Expendedor.COCA || numProducto == Expendedor.SPRITE) {
            producto = expendedor.comprarBebida(m, numProducto);
        } else if (numProducto == Expendedor.SNICKER || numProducto == Expendedor.SUPER8) {
            producto = expendedor.comprarDulce(m, numProducto);
        }

        if (producto != null) {
            sabor = producto.comer();
        }

        boolean recuperandoMonedas = true;
        while (recuperandoMonedas) {
            Moneda moneda = expendedor.getVuelto();
            if (moneda != null) {
                totalMonedas += moneda.getValor();
            } else {
                recuperandoMonedas = false;
            }
        }
    }

    public int getCantidadMonedas() {
        return totalMonedas;
    }

    public String getSaborProducto() {
        return sabor;
    }
}

