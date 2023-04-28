import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5, 300);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de su moneda (100, 500, 1000, 1500):");
        int valor = sc.nextInt();
        Moneda m = null;
        switch (valor) {
            case 100:
                m = new Moneda100();
                break;
            case 500:
                m = new Moneda500();
                break;
            case 1000:
                m = new Moneda1000();
                break;
            case 1500:
                m = new Moneda1500();
                break;
            default:
                System.out.println("Valor de moneda no válido");
                break;
        }
        if (m != null) {
            System.out.println("¿Qué bebida desea comprar? (1 para CocaCola, 2 para Sprite)");
            int opcion = sc.nextInt();
            Comprador c = new Comprador(m, opcion, exp);
            if (c.cuantoVuelto() > 0) {
                System.out.println("Su cambio es de " + c.cuantoVuelto() + " pesos");
            }
            if (c.queBebiste() != null) {
                System.out.println("Usted compró una " + c.queBebiste());
            } else {
                System.out.println("No se pudo comprar la bebida");
            }
        }
    }
}

