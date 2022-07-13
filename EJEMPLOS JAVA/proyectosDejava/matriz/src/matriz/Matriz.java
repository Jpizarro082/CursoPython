package matriz;
import java.util.Arrays;
public class Matriz {

    public static void main(String[] args) {
        int ar[][] = new int [3][5];
        ar [1][3]=28;
        System.out.println("recorrido de posisiones");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<5; j++)
            {
                System.out.print("("+ i +", "+ j + ")");
            }
        }
        System.out.println("\n");
        for(int i=0; i<ar.length; i++)
        {
            for(int j=0; j<ar.length; j++)
            {
                System.out.println("("+ i +", "+ j + ")"+"="+ ar[i][j]);
            }
        }
    }
    
}
