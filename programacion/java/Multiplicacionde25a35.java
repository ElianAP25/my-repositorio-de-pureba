import java.util.Scanner;

public class Multiplicacionde25a35 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("numero a miltiplicar: ");
        n = entrada.nextInt();
        
        for(int i = 25; i<=35; i++){
            System.out.println("El resultado es: " + n*i);
            
        }
    }
}