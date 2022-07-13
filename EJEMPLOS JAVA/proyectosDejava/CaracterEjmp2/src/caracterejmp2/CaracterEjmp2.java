
package caracterejmp2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CaracterEjmp2 {

    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
       int totElem;
       
       totElem = Integer.parseInt(JOptionPane.showInputDialog("Indique total de datos a ingresar"));
       
       char letras[] = new char[totElem];
       
       System.out.println("Ingrese cada caracter");
       for(int i=0; i<totElem; i++){
           System.out.print((i+1)+"Ingrese un caracter: ");
           letras[i] = entrada.next().charAt(0);
           
       }
        System.out.println("\n Los caracteres almacenados son: ");
        for(int i=0; i<totElem; i++){
            System.out.println(letras[i]+"");
        }
    }    
}
