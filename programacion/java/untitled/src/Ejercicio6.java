void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa la temperatura: ");
    int temp = sc.nextInt();
    System.out.println("Ingresa la humedad: ");
    int hum = sc.nextInt();

    if (temp < 10) {
        System.out.println("Esta muerta de frío.");
    } else if (temp > 25) {
        System.out.println("Esta muerta de calor.");
    }

    if (hum < 60 || hum > 80) {
        System.out.println("Esta muerta por humedad inadecuada.");
    }

    if (temp >= 10 && temp <= 25 && hum >= 60 && hum <= 80) {
        System.out.println("Está viva.");
    }


}
