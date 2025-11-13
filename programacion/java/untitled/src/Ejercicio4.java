void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("El sofa cuesta 300$");
    System.out.println("Ingresa la cantidad de dinero que tienes: ");
    int dinero = sc.nextInt();

    if (dinero >=300)
        System.out.println("Puedes comprarlo");
    else
        System.out.println("no puedes comprarlo");


}