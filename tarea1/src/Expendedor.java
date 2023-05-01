class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu;
    private int precio;
    public static final int COCA = 1;
    public static final int SPRITE = 2;

    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new Deposito();
        sprite = new Deposito();
        monVu = new DepositoM();
        precio = precioBebidas;

        for (int i = 0; i < numBebidas; i++) {
            Bebida cc = new CocaCola(100 + i);
            coca.addBebida(cc);
            Bebida sp = new Sprite(200 + i);
            sprite.addBebida(sp);
        }
    }

    public Bebida comprarBebida(Moneda m, int n) {
        if (m != null && m.getValor() >= precio) {
            if (n == 1) {
                Bebida b = coca.getBebida();
                if (b != null) {
                    for (int i = 0; i < (m.getValor() - precio) / 100; i++) {
                        Moneda100 a = new Moneda100();
                        monVu.addMoneda(a);
                    }
                    return b;
                }

            } else if (n == 2) {

                Bebida b = sprite.getBebida();
                if (b != null) {
                    for (int i = 0; i < (m.getValor() - precio) / 100; i++) {
                        Moneda100 a = new Moneda100();
                        monVu.addMoneda(a);
                    }
                    return b;
                }
            } else {
                monVu.addMoneda(m);
                return null;
            }
        } else {

            monVu.addMoneda(m);
            return null;
        }
        monVu.addMoneda(m);
        return null;
    }

    public int getPrecio() {
        return precio;
    }

    public Moneda getVuelto() {
        return monVu.getMoneda();
    }

}