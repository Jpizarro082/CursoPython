from math import factorial
def ingreso_lista():
    lista.append(int(value))


def ordena_lista():
    listapar = []
    listainpar = []
    lista.sort()
    for i in lista:
        if i % 2 == 0:
            listapar.append(i)
        else:
            listainpar.append(i)     
    return listapar,listainpar

def factorialfun():
    return factorial(num)

lista = []
par, inpar = [],[]
while True:
    value = input("Ingrese valores a la lista (ingrese 'S' para detener)\nR:")

    if value == 'S':
        break
    else:
        ingreso_lista()

print(lista)

par, inpar = ordena_lista()

print(par)
print(inpar)

num = int(input("Ahora ingrese un número y calcularemos el factorial"))

print(factorialfun())





