public class Tablas {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%15s", "Tabla del " + i);
        }
        System.out.println();

        for (int j = 25; j <= 35; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%15s", i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
