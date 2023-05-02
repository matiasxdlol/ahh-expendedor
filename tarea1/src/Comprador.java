class Comprador {
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {

        Bebida a = exp.comprarBebida(m, cualBebida);

        if (a == null) sonido = null;
        else sonido = a.beber();

        boolean b = true;
        while (b) {

            Moneda s = exp.getVuelto();
            if (s != null) vuelto += s.getValor();
            else b = false;

        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queBebiste() {
        return sonido;
    }
}