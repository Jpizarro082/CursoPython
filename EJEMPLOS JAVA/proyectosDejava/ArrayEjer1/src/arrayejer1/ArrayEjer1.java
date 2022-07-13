
package arrayejer1;

import java.util.Scanner;
public class ArrayEjer1 {

    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          float numeros[] = new float[5];
          //otra forma de declararacion
          // float[] numeros = new float[5];
          System.out.println("Ingrese los datos: ");
          for(int i=0 ; i<=5 ; i++){
              System.out.print((1+1)+"Digite un numero: ");
              numeros[i] = entrada.nextFloat();
          }
          System.out.println("\n los datod almacenados son: ");
          for( float i:numeros){
              System.out.println(i);
          }
    }
    
}
