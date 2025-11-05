for fila in range(10):
    for columna in range(10):
        print("* ", end="")
    print()

print("="*20)

for fila in range(1,11):
    print("* " * fila)

print("="*10)

for fila in range(10,0,-1):
    print("* " * fila)

print("="*20)

for fila in range(1,11):
    nblancos = 10 - fila

    for nblanco in range(nblancos):
        print("  ", end="")
    
    for asterisco in range(fila):
        print("* ", end="")
    
    print()

print ("="*20)

for fila in range(1,11):
    num_asterisco = 11 - fila

    for blanco in range(fila - 1):
        print("  ", end="")
    
    for asterisco in range(num_asterisco):
        print("* ", end="")
    
    print()

print("="*20)

for fila in range(1,11):
    nblancos = 10 - fila

    for nblanco in range(nblancos):
        print("  ", end="")
    
    for asterisco in range((fila * 2) - 1):
        print("* ", end="")
    
    print()

print("="*20)

for fila in range(10,0,-1):
    nblancos = 10 - fila

    for nblanco in range(nblancos):
        print("  ", end="")
    
    for asterisco in range((fila * 2) - 1):
        print("* ", end="")
    
    print()
print("="*20)

altura = 10

for fila in range(altura):
    for columna in range(2 * altura - 1):
        inicio = altura - 1 - fila
        fin = altura - 1 + fila

        # Lados del triángulo
        if columna == inicio or columna == fin:
            print("* ", end="")
        # Base del triángulo
        elif fila == altura - 1 and inicio < columna < fin:
            print("* ", end="")
        # Interior del triángulo
        elif inicio < columna < fin:
            print("  ", end="")
        else:
            print("* ", end="")

    print()

print("="*20)

altura = 10
num_columnas = 2 * altura - 1

for fila in range (1, altura - 1):
    num_asteriscos = fila * 2 - 1
    num_blancos = (num_columnas - num_asteriscos) // 2

    for blanco in range(num_blancos):
        print("  ", end="")

    for a in range (num_asteriscos):
        print("* ", end="")
    print()

print("=" *20)

altura = 4
num_columnas = altura * 2 - 1

for fila in range (1, altura + 1):
    num_asteriscos = fila * 2 - 1
    num_blancos = (num_columnas - num_asteriscos) // 2

    for col in range (1, num_columnas + 1):
        if col <= num_blancos:
            print("  ", end="")
        elif col <= (num_blancos + num_asteriscos):
            print("* ", end="")
    print()

print("=" *20)
        
