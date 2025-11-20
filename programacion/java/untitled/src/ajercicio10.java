void main() {
    Scanner sc = new Scanner(System.in);

    int dia = 1;
    double suma = 0;
    double minima = 100;
    double maxima = -100;
    boolean critico = false;

    while (dia <= 7) {
        System.out.print("Temperatura del día " + dia + ": ");
        double temp = sc.nextDouble();

        suma += temp;

        if (temp < minima) {
            minima = temp;
        }

        if (temp > maxima) {
            maxima = temp;
        }

        if (temp <= 0 || temp >= 35) {
            critico = true;
            System.out.println(" Día crítico con " + temp + "°");
        }

        dia++;
    }

    double media = suma / 7;

    System.out.println("\nMedia: " + media + "°");
    System.out.println("Mínima: " + minima + "°");
    System.out.println("Máxima: " + maxima + "°");

    if (critico) {
        System.out.println(" Hubo al menos un día crítico.");
    } else {
        System.out.println(" Semana tranquila.");
    }
}