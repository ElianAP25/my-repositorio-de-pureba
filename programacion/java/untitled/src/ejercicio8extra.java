void main() {
    IO.println("ingresa 10 notas: ");
    Scanner sc = new Scanner(System.in);
    int cantidadNotas = 10;
    double suma = 0;

    for (int i = 1; i <= cantidadNotas; i++) {
        System.out.print("Introduce la nota " + i + ": ");
        double nota = sc.nextDouble();
        suma += nota;
    }

    double media = suma / cantidadNotas;
    System.out.println("La media es: " + media);
}