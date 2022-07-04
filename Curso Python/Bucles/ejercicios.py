from turtle import down


for i in range(1,11):
    print(i)

down = int(input("Ingresa el limite inferior\nR:"))
up = int(input("Ingresa el limite superior\nR:"))

for j in range(down, up):
    print(j)

for k in range(down, up):
    if (k % 2) == 0:
        continue
    else:
        print(k)
