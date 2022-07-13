

package estrcontrolrepedowhile;
import java.util.Scanner;
public class EstrControlRepeDowhile {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int x= 1, cali, total, totApro = 0,totRepro=0;
        
        System.out.print("Indica el total de calificaciones a ingresar: ");
        total = entrada.nextInt();
        
        do{
            System.out.print("Ingresa la calificacion");
            cali = entrada.nextInt();
            x++;
            if(cali>=6 && cali<=10){
                totApro++;
            }
            if(cali>=0 && cali<6){
                totApro++;
            }
        }while(x<=total);
        System.err.println("Total de reprobados: "+totRepro);
        System.err.println("Total de reprobados: "+totApro);
    }
}
