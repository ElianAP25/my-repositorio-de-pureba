void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa cuanto cuesta el juego");
    int precio = sc.nextInt();
    System.out.println("Ingresa la cantidad de dinero que tienes: ");
    int dinero = sc.nextInt();

    int dif1 = dinero - precio;
    int dif2 = precio - dinero;

    if (dinero >=precio)
        System.out.println("Puedes comprarlo. " + "Te sobra: "  + dif1 + "$");
    else
        System.out.println("no puedes comprarlo. " + "Te falta: " + dif2 + "$");
}
