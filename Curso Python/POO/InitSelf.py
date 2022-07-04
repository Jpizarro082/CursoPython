class FabricaDeCelulares():
    marca = "OnePLus"
    
    def MadeSamsung(self): #Se prefiere el uso de letras minusculas para los métodos
        self.marca = "Samsung"
        
telefono = FabricaDeCelulares()

print(telefono.marca)

telefono.MadeSamsung()

print(telefono.marca)
        