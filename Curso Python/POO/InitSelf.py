class FabricaDeCelulares():
    marca = "OnePLus"
    
    def MadeSamsung(self): #Se prefiere el uso de letras minusculas para los métodos
        self.marca = "Samsung" #El uso del metodo "self" es para hacer global la la variable y su cambio
        
telefono = FabricaDeCelulares()

print(telefono.marca)

telefono.MadeSamsung()

print(telefono.marca)
        