import java.util.Scanner;

public class nombre {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hola, ¿cuál es tu nombre?: ");
        String name = sc.nextLine();
        System.out.println("Hola, " + name + " bienvenido, Como estas? ");
    }
}