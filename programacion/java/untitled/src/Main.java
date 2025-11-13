void main() {
    int num1 = 5;
    int num2 = 10;

    int num3 = num1 + num2;
    System.out.println(num3);
    System.out.println("==============================");

    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa el primer numero: ");
    int nume1 = sc.nextInt();
    System.out.println("Ingresa el segundo numero: ");
    int nume2 = sc.nextInt();


    int nume3 = nume1 + nume2;

    System.out.println("tu numero es: " + nume3);

}