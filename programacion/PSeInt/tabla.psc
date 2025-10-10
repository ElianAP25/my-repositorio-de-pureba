Algoritmo sin_titulo
	Definir a,b,x,z,y Como Entero;
	
	Escribir "Elija una de las opciones: ";
	Escribir "1.Suma";
	Escribir "2.Resta";
	Escribir "3.Multiplicacion";
	Escribir "4.Division";
	Escribir "5.Par o Impar";
	leer x;
	
	Segun x Hacer
		1:
			Escribir "Elegiste la Suma ";
		2:
			Escribir "Elegiste la Resta ";
		3:
			Escribir "Elegiste la Multiplicacion ";
		4:
			Escribir "Elegiste la Division ";
		5:
			Escribir "Elegiste la Par o impar";
		De Otro Modo:
			Escribir "error";
	FinSegun
	
	Escribir Sin Saltar "Ingresa primer numero: ";
	Leer a;
	Escribir Sin Saltar "Ingresa Segundo numero: ";
	Leer b;
	
	z=(a%2);
	y=(b%2);
	
	Segun x Hacer
		1:
			Escribir a+b;
		2:
			Escribir a-b;
		3:
			Escribir a*b;
		4:
			Escribir a/b;
		5:
			Si z=0 Entonces
				Escribir "El primer numero es par:";
			SiNo
				Escribir "El primer numero es impar";
			FinSi
			Si y=0 Entonces
				Escribir "El segundo numero es par:";
			SiNo
				Escribir "El segundo numero es impar";
			FinSi
		De Otro Modo:
			Escribir "error";
	FinSegun
FinAlgoritmo
