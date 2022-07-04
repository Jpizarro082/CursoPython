tupla = (1, 2, 3, 4, 5) #puede o no llevar los parentesis
tupla2 = (6, 7, 8, 9, 10)
tupla3 = ("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre")
tupla4 = ('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')

print(type(tupla))

print(tupla[0:3])

print(tupla+tupla2)

num = int(input("Ingrese un número entre 1 y 12\nR:"))

print(tupla3[num-1])

op2 = input("Ingrese una letra").lower()

if op2 in tupla4:
    print(op2)
else:
    print("WTF eso ni existe")


