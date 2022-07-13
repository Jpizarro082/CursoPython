package estrcontrolrepewhile;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EstrControlRepeWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, j;
        System.out.println("que numero quiere empezar 1-10");
        
        i = entrada.nextInt();
        while (i >= 1){
            System.out.println(i);
            i--;
        }
        j = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero donde quiere empezar de forma hacendente 1-10"));
        while (j <= 10){
            JOptionPane.showMessageDialog(null,j);
            j++;
        }
    }
    
}
