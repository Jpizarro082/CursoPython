dicc = {"Nombre": "Jorge", "Apellido": "Pizarro", "Estatura": 1.80}
dicc2 = {"Motivo": "Cancelación"}

print(dicc)

print(dicc.keys())
print(dicc.values())

print(dicc["Estatura"])

dicc["Peso"] = 58

print(dicc)

dicc.pop("Estatura")

print(dicc)

print(dicc.get("Peso"))

dicc.setdefault("Estatura", 1.80)
print(dicc)

dicc.update(dicc2)

print(dicc)