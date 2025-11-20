void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa la primera nota: ");
    int nota1 = sc.nextInt();
    System.out.println("Ingresa la segunda nota: ");
    int nota2 = sc.nextInt();
    System.out.println("Ingresa la tercera nota: ");
    int nota3 = sc.nextInt();
    System.out.println("Ingresa la cuarta nota: ");
    int nota4 = sc.nextInt();
    System.out.println("Ingresa la quinta nota: ");
    int nota5 = sc.nextInt();

    int resu = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

    IO.println("total de la media de notas es: " + resu);
}