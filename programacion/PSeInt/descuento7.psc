Proceso descuento
	Definir platos, precio, total, des, totalapag Como Real;
	Escribir sin saltar ("ingresa cuantos platos se ha pedido: ");
	Leer platos;
	Escribir Sin Saltar ("igresa el precio de los platos: ");
	Leer precio;
	total = platos * precio;
	Si total >= 50 
		Entonces
        des = total * 0.10 ;
		totalapag = total - des;
        Escribir ("Felicidades, Puedes pagarlo aplicando el descuento por hacer una compra mayor a los 50$");
        Escribir ("total a pagar: "), totalapag, ("$");
    Sino
        Escribir ("Disculpa, No se puede aplicar el descuento");
        Escribir ("Total a pagar: "), total, ("$");
    FinSi
FinProceso
