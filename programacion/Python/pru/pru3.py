altura = 4
ancho = altura * 2 - 1
for fila in range (1, ancho + 1):
    for columna in range (1, ancho + 1):
        if columna >= altura + 1 - fila:
          print("* ", end="")
        else:
           print("  ", end="")
print()

