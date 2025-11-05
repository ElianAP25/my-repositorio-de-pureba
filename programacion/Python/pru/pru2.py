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

for fila in range(1,11):
    num_asterisco = fila * 2 - 1
    
    for blanco in range(10 - fila):
        print("  ", end="")

    for asterisco in range(num_asterisco):
        print("* ", end="")
    print()

print("="*20)