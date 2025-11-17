void main() {
    IO.println("Ingresa tu nombre: ");
    String nombre = IO.readln();
    IO.println("Ingresa tu edad: ");
    int edad = Integer.parseInt(IO.readln());
    IO.println("Ingresa tu salario: ");
    float salario = Float.parseFloat(IO.readln());

    String mensaje = """
            informacion del usuario:
            ------------------------
            Nombre:     %s
            Edad:       %d
            Salario:    %.2f
            ------------------------
            """.formatted(nombre, edad, salario);
    IO.println(mensaje);
    var random = new Random();
    var numeroAleatorio = random.nextInt(9999);
    String numeroFormateado = String.format("%04d", numeroAleatorio);
    IO.println("Nº EMPLEADO: " + numeroFormateado);

}