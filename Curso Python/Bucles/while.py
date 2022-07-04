import datetime
i = 1
op = int(input("Ingresa un número\nR:"))
while(i < 11):
    print("{} x {} es igual a {}".format(op, i, op*i))
    i += 1

edad = int(input("Ingrese su edad pirobo\nR:"))

date = datetime.date.today()
i = 0
while (i <= edad):
    aux = date.year-edad
    if i == 0:
        print("En el año {} tu naciste".format(aux))
    elif i == 1:
        print("En el año {} cumpliste {} año".format(aux+i, i))
    else:
        print("En el año {} cumpliste {} años".format(aux+i, i))
    i += 1

