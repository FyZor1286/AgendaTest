import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Añadir contacto");
        System.out.println("2. Mostrar contacto");
        System.out.println("3. Buscar contacto");
        System.out.println("4 Salir");
        System.out.println(" ");
        System.out.println("Escoge la opcion deseada.");

        int opt = sc.nextInt();

        System.out.println("Has escogido la opcion " + opt + ".");

    }
}
