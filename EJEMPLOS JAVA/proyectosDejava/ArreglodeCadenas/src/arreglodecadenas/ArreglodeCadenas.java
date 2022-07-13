package arreglodecadenas;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArreglodeCadenas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totElem;
        totElem = Integer.parseInt(JOptionPane.showInputDialog("indique total de nombre a ingresar: "));
        String nombres [] = new String[totElem];
        System.out.println("::: ingrese datos :::");
        for(int i=0; i<nombres.length; i++ )
        {
            System.out.println((i+1)+"ingrese un nombre: ");
            nombres[i] = entrada.nextLine();
        }
        System.out.println("\n ::: lista de nombres almacenados :::");
        for (String dato:nombres)
        {
            System.out.println(dato);
        }
        System.out.println("");
    }
    
}
