from ast import NotIn


while True:
    try:
        edad = int(input("Ingrese su edad plox\nR:"))
        divisor = int(input("Ingresa un Divisor para tu edad\nR:"))
        print("Tu edad es {} y la mitad de tu edad es {}".format(edad, int(edad/divisor)))
        break
    except ZeroDivisionError:
        print("No existe la divison por cero, intenta nuevamente")
    except ValueError:
        print("El valor ingresado debe ser un número entero, intenta nuevamente")
    finally:
        print("Este comentario siempre se ejecutará, aunque hayas realizado un ingreso de datos incorrecto") #Se ejecuta siempre