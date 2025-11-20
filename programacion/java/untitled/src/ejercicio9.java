void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Cuantos platos ha pedido: ");
    int numplatos = sc.nextInt();
    int total = 0;

    IO.println("total de platos: " + numplatos);
    for (int i = 1; i <= numplatos; i++) {
        System.out.print("Introduce el precio del plato " + i + ": ");
        double precio = sc.nextDouble();
        total += precio;
    }

        int descuento = (int) (total * 0.1);

        if (total >=50)
            IO.println("se aplicara un descuento por su compra mayor a 50 euros, su total es de: "+ (total - descuento));
        else
            IO.println("su total a pagar es: " + total);

}