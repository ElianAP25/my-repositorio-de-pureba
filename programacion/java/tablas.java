public class tablas{
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            System.out.println("Tabla del " + i);
            for(int j = 25; j<=35; j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
}
