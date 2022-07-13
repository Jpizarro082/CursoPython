
package entradasalidaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaSalidaIO {
public static void main(String[] args) throws IOException {
    calcularNacimiento();
}


public static void escribir(String mensaje){
    System.err.println(mensaje);
}

public static int leer()throws IOException{

int h;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
h=        
h =Integer.parseInt(br.readLine());
return (h);
}
public static void calcularNacimiento() throws IOException{
int edad, actual ,nacimiento;
escribir("cual es tu edad");
edad = leer();
escribir("que año es este");
actual =leer();
nacimiento = actual- edad;
escribir ("TUaño de nacimieno es: "+nacimiento);
    }
    
}
