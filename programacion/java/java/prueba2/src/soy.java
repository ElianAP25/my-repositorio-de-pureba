import java.util.Scanner;

public class soy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        String mensaje = "hola soy " + nombre + " y soy el mejor programador del mundo!";
        while (true) {
            System.out.print(mensaje);
        }
    }
}