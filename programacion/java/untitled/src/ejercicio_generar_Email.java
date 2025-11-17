void main() {
    String nombreCompleto = "Elian Acebo Peñafiel";
    String empresa = "Borja Moll";
    String dominio = "eu";

    nombreCompleto = nombreCompleto.toLowerCase();
    String nombreformateado = nombreCompleto.replace(" ", ".");
    String empresaformateada = empresa.toLowerCase().replace(" ", ".");
    String email = nombreformateado + "@" + empresaformateada + "." + dominio;

    IO.println("email: " + email);


}

