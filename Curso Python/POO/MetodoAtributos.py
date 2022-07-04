class FabricadeTelefonos():
    marca = "OnePlus"
    color = "Midight Blue"
    memoria_ram = 8
    almacenamiento = 256
    
    def llamar(self, mensaje):
        return mensaje
    
telefono = FabricadeTelefonos()
    
print(telefono.marca)
print(telefono.color)
print(telefono.memoria_ram)
print(telefono.almacenamiento)

print(telefono.llamar("Llamando a Aurora"))