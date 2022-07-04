dicc = {"Guatemala": "Ciudad de Guatemala", "El Salvador": "San Salvador", "Honduras": "Honduras","Nicaragua": "Managua", "Costa Rica": "San Jose", "Panama": "Panama", "Argentina": "Buenos Aires", "Colombia": "Bogota", "Venezuela": "Caracas", "España": "Madrid"}

op = input("Ingrese un pais\nR:")

if op in dicc:
    print(dicc[op])    
else:
    print("Ese pais no esta en el regristro")