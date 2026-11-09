import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Locale;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("1. Añadir contacto");
        System.out.println("2. Mostrar contacto");
        System.out.println("3. Buscar contacto");
        System.out.println("4 Salir\n");
        System.out.println("Escoge la opcion deseada.");

        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                System.out.println("Has escogido añadir contacto.");
                break;
            case 2:
                System.out.println("Has escogido mostrar contacto.");
                break;
            case 3:
                System.out.println("Has escogido buscar contacto.");
                break;
            case 4:
                System.out.println("Has escogido salir.");
                break;
            default:
                System.out.println("Escoja una de las opciones.");
        }
    }
}
