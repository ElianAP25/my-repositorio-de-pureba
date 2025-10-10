import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.println("Primer numero:");
        numero1 = entrada.nextInt();
        System.out.println("segundo numero:");
        numero2 = entrada.nextInt();
        
        resultado = numero1 * numero2;
        
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}