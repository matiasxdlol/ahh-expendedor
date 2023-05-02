class Comprador {
    private String sabor;
    private int exp;
    private int vuelto;

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

    public int Vuelto() {
        return vuelto;
    }

    public String ComisteBebiste() {
        return sabor;
    }
}