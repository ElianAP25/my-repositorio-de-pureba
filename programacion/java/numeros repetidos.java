import java.util.HashMap;

public class numerosrepetidos {
    public static void main(String[] args) {
        HashMap<Integer, Integer> contador = new HashMap<>();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%15s", "Tabla del " + i);
        }
        System.out.println();

        for (int j = 25; j <= 35; j++) {
            for (int i = 1; i <= 10; i++) {
                int resultado = i * j;
                System.out.printf("%15s", i + " x " + j + " = " + resultado);

                contador.put(resultado, contador.getOrDefault(resultado, 0) + 1);
            }
            System.out.println();
        }
        
        System.out.println("\nNúmeros que se repiten:");
        for (Integer num : contador.keySet()) {
            if (contador.get(num) > 1) {
                System.out.println("El número " + num + " se repite " + contador.get(num) + " veces.");
            }
        }
    }
}