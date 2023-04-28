import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5,300);
        Moneda m = null;
        Comprador c=null;
    }
}
class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu;
    private  int precio;
    public static final int  COCA = 1;
    public static final int  SPRITE = 2;
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

                        Moneda a = new Moneda100();
                        monVu.addMoneda(a);
                    }

                    return b;
                }
            }else if (n == 2){

                Bebida b = sprite.getBebida();

                if (b != null) {
                    for (int i = 0; i < (m.getValor() - precio) / 100; i++) {

                        Moneda a = new Moneda100();
                        monVu.addMoneda(a);
                    }
                    return b;
                }
            }else{
                monVu.addMoneda(m);
                return null;
            }
        }else {

            monVu.addMoneda(m);
            return null;
        }
        monVu.addMoneda(m);
        return null;
    }
    public int getPrecio(){ return precio; }
    public Moneda getVuelto(){ return monVu.getMoneda(); }
}
class Comprador{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){

        Bebida a = exp.comprarBebida(m, cualBebida);

        if (a== null) sonido = null;
        else sonido = a.beber();

        boolean b = true ;
        while(b){

            Moneda s = exp.getVuelto();
            if (s != null) vuelto += s.getValor();
            else b = false;
        }
    }
    public int cuantoVuelto(){ return vuelto; }
    public String queBebiste(){ return sonido; }
}
class Deposito{
    private ArrayList<Bebida> al;
    public Deposito(){ al = new ArrayList<>(); }
    public void addBebida(Bebida b){ al.add(b); }
    public Bebida getBebida(){

        if(al.size()==0) return null;

        Bebida b = al.remove(0);
        return b;
    }
}
class DepositoM{
    private ArrayList<Moneda> mon;
    public DepositoM(){ mon = new ArrayList(); }
    public void addMoneda(Moneda b){ mon.add(b); }
    public Moneda getMoneda(){
        if(mon.size()==0) return null;

        Moneda b = mon.remove(0);
        return b;
    }
}
abstract class Bebida{
    private int serie;
    public Bebida(int serie){ this.serie = serie; }
    public int getSerie() { return serie; }
    public abstract String beber();
}
class Sprite extends Bebida{
    public Sprite(int s){ super(s); }
    public String beber(){ return "sprite"; }
}
class CocaCola extends Bebida{
    public CocaCola(int s){ super(s); }
    public String beber(){ return "cocacola"; }
}
abstract class Moneda {
    public Moneda() { }
    public Moneda getSerie() { return this; }
    public abstract int getValor();
}
class Moneda1500 extends Moneda{
    public Moneda1500(){ super(); }
    public int getValor(){ return 1500; }
}
class Moneda1000 extends Moneda{
    public Moneda1000(){ super(); }
    public int getValor(){ return 1000; }
}

class Moneda500 extends Moneda{
    public Moneda500(){ super(); }
    public int getValor(){ return 500; }
}
class Moneda100 extends Moneda{
    public Moneda100(){ super(); }
    public int getValor(){ return 100; }
}