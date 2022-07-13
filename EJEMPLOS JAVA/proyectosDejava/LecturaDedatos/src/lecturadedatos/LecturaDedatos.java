
package lecturadedatos;

import java.util.Scanner;

public class LecturaDedatos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
    int edad ;
    Double calificacion = 0.0;
    String nombre = "";
    char grupo;
    
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(lector.nextLine());
        System.out.println("Ingrese su calificacion");
        //calificacion = lector.nextDouble();
        calificacion = Double.parseDouble(lector.nextLine());
        lector.nextLine();
        System.out.println("Ingrese su nombre");
        nombre = lector.nextLine();
        System.out.println("Ingrese el grupo (A,B): ");
        grupo = lector.next() .charAt(0);
        
     
        System.out.println("Tu edad es: "+edad);
        System.out.println("Tu calificacion es : "+calificacion);
        System.out.println("Tu nombre es: "+nombre);
        System.err.println("Tu grupo es: "+grupo);
   
    }
    
}
