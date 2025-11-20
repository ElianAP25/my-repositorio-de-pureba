for fila in range(10):
    for columna in range(10):
        print("* ", end="")
    print()

print("="*20)
#=========================================================================================================
for fila in range(1,11):
    print("* " * fila)

print("="*10)
#=========================================================================================================
for fila in range(10,0,-1):
    print("* " * fila)

print("="*20)
#=========================================================================================================
for fila in range(1,11):
    nblancos = 10 - fila

    for nblanco in range(nblancos):
        print("  ", end="")
    
    for asterisco in range(fila):
        print("* ", end="")
    
    print()

print ("="*20)
#=========================================================================================================
for fila in range(1,11):
    num_asterisco = 11 - fila

    for blanco in range(fila - 1):
        print("  ", end="")
    
    for asterisco in range(num_asterisco):
        print("* ", end="")
    
    print()

print("="*20)
#=========================================================================================================
for fila in range(1,11):
    nblancos = 10 - fila

    for nblanco in range(nblancos):
        print("  ", end="")
    
    for asterisco in range((fila * 2) - 1):
        print("* ", end="")
    
    print()

print("="*20)
#=========================================================================================================
for fila in range(10,0,-1):
    nblancos = 10 - fila

    for nblanco in range(nblancos):
        print("  ", end="")
    
    for asterisco in range((fila * 2) - 1):
        print("* ", end="")
    
    print()
print("="*20)
#=========================================================================================================
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
#=========================================================================================================
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
#=========================================================================================================
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
#=========================================================================================================
altura = 5
ancho = altura
for fila in range (1, altura + 1):
    for columna in range (1, ancho + 1):
        if columna <= fila:
            print("* ", end="")
        else:
            print(" ", end="")
    print()

print("=" *20)
#=========================================================================================================
altura = 5
ancho = altura
for fila in range (1, altura + 1):
    for columna in range (1, ancho + 1):
        if (columna == 1) or (columna == 1) or (fila == altura) :
            print("* ", end="")
        else:
            print("  ", end="")
    print()

print("=" *20)
#=========================================================================================================
altura = 5
for fila in range(1, altura + 1):
    for columna in range(1, fila + 1):
        if fila == altura or columna == 1 or columna == fila:
            print("* ", end="")
        else:
            print("  ", end="")
    print()

print("=" * 20)
#=========================================================================================================
altura = 5
ancho = altura
for fila in range (1, altura + 1):
    for columna in range (1, ancho + 1):
        if (columna == 1) or (columna == 5) or (fila == 1) or (fila == altura):
            print("* ", end="")
        else:
            print("  ", end="")
    print()

print("=" *20)
#=========================================================================================================
altura = 4
ancho = altura * 2 - 1
for fila in range (columna):
    for columna in range (altura * 2):
        if (columna >= altura + 1 - fila) and (columna <= altura - 1 + fila):
            print("* ", end="")
        else:
            print("  ", end="")
    print()

print("=" *20)
#=========================================================================================================
altura = 4
ancho = altura * 2 - 1

for fila in range(altura):
    for columna in range(ancho):
        if (columna == altura - 1 - fila or columna == altura - 1 + fila or fila == altura - 1):
            print("* ", end="")
        else:
            print("  ", end="")
    print()

print("=" *20)
#=========================================================================================================
altura = 7
ancho = altura
for fila in range (1, altura + 1):
    for columna in range (1, ancho + 1):
        if (
            columna == 1 or columna == altura or fila == 1 or fila == altura or 
            (fila >= 3 and fila <=5 and columna >= 3 and columna <=5) and not (fila == 4 and columna == 4)):
            print("* ", end="")
        else:
            print("  ", end="")
    print()
print("=" *20)
#=========================================================================================================
altura = 10
ancho = altura
for fila in range (1, altura + 1):
    for columna in range (1, ancho + 1):
        if (
            columna == 1 or columna == altura or fila == 1 or fila == altura or 
            (fila >= 3 and fila <=8 and columna >= 3 and columna <=8) and not (fila >= 4 and fila <=7 and columna >= 4 and columna <=7 )):
            print("* ", end="")
        else:
            print("  ", end="")
    print()
print("=" *20)
#=========================================================================================================
altura = 5
ancho = altura
for fila in range (1, altura + 1):
    for columna in range (1, ancho + 1):
        if (
            columna == 1 or columna == altura or fila == 1 or fila == altura or 
            (fila >= 3 and fila <=altura - 2 and columna >= 3 and columna <= altura - 2 ) 
            and not (fila >= 4 and fila <=altura - 3 and columna >= 4 and columna <= altura - 3 )):
            print("* ", end="")
        else:
            print("  ", end="")
    print()
print("=" *20)
#=========================================================================================================
alt = 5
amp = alt
pm = (alt - 1) / 2   # entero

for fila in range(alt):
    df = abs(fila - pm)
    desfase = pm - df
    mitadtapa = alt - 2 * fila   # mover aquí (depende de fila)

    for columna in range(amp):
        tapa = (desfase % 2 == 0) and abs(df-pm)<=mitadtapa / 2

        if fila == 0 or fila == alt - 1 or tapa:
            print("* ", end="")
        else:
            print("  ", end="")
    print()
