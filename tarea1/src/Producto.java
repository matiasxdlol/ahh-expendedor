abstract class Producto {
    private int serie;

    public Producto(int serie){
        this.serie=serie;
    }

    public int getSerie(){
        return serie;
    }

    public abstract String GetBeber();

    public abstract String GetComer();

}
