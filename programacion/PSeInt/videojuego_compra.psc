Proceso videojuego_compra
	Definir precio, dinero, diferencia como entero;
	Escribir ("ingresa cuanto cuesta el juego");
	Leer precio;
	Escribir Sin Saltar ("igresa la cantidad de dinero que tienes: ");
	Leer dinero;
	Si dinero >= precio 
		Entonces
        diferencia <- dinero - precio;
        Escribir ("Puedes comprar el juego");
        Escribir ("Te sobra: "), diferencia, ("$");
    Sino
        diferencia <- precio - dinero;
        Escribir ("No puedes comprar el videojuego");
        Escribir ("Te falta: "), diferencia, ("$");
    FinSi

FinProceso
