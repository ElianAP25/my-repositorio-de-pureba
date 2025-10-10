Algoritmo reservaVuelos
	Definir n, em, dni Como Caracter;
	definir x, tel, el Como Entero;
	
	Escribir "Aplicacion de vuelos";
	Escribir Sin Saltar"Ingrese nombre: ";
	Leer n;
	Escribir Sin Saltar "Ingrese su DNI/NIE: ";
	Leer dni;
	Escribir Sin Saltar"Ingrese Email: ";
	Leer em;
	Escribir Sin Saltar "Ingrese su Telefono: ";
	Leer tel;
	Escribir "Bienvenido, " ,n, " Revisa si tu informacion es correcta: ";
	Escribir  dni;
	Escribir em;
	Escribir tel;
	Escribir  " Ha sido ingresado correctamente. ";
	
	Escribir "Elija una de las 2 opcione:";
	Escribir "1.vuelos con escala";
	Escribir "2.vuelos sin escala";
	Leer x;
	
	Si x=1 Entonces
		Escribir "Hola ",n," El numero de tu vuelo con escala es: " ,Aleatorio(100,999), "NKJ";
	SiNo
		Escribir "Hola ",n," El numero de tu vuelo sin escala es: " ,Aleatorio(100,999), "NKJ";
	FinSi
FinAlgoritmo
