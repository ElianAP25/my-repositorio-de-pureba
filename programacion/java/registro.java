import java.util.Scanner;

public class registro {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hola, ¿cuál es tu nombre?: ");
        String name = sc.nextLine();
        System.out.println("Ahora, ingresa tu apellido: ");
        String lastname = sc.nextLine();
        System.out.println("Agrega tu edad: ");
        String age = sc.nextLine();

        System.out.println("hola, " + name + lastname + " tu edad es " + age + " verdad?");
        System.out.println("como estas?: ");
        String status = sc.nextLine();
        System.out.println("has dicho que estas " + status );
        
    }
}