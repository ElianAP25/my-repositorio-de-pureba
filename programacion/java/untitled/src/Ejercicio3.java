void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa la cantidad de metros: ");
    int nume1 = sc.nextInt();

    float kilo = nume1 / 1000;
    int cen = nume1 * 100;
    int mm = nume1 * 1000;

    System.out.println("los metros en kilometros son: "+ kilo +"KM");
    System.out.println("los metros en centimetros son: "+ cen +"CM");
    System.out.println("los metros en milimetros son: "+ mm +"MM");

}