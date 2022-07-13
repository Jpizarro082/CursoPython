package arreglo3;

import java.util.Arrays;

public class Arreglo3 {

    public static void main(String[] args) {
        int ar[]={11,22,33,44,55};
        int otro []={11,22,33,44,55,66};
        
        boolean bandeIgual = true;
        bandeIgual = Arrays.equals(ar, otro);
        System.out.println("IGUALES: "+bandeIgual);
    }
    
}
