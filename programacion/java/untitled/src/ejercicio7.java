void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa el primer numero: ");
    int nume1 = sc.nextInt();

    int resu = (nume1 % 2);

    if (resu == 0)
        System.out.println("Es Par.");
    else
        System.out.println("Es impar");
}