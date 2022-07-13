package estrcontrolcondicionales;

import javax.swing.JOptionPane;

public class EstrControlCondicionales {

    public static void main(String[] args) {
        int edad, mayorEdad = 18;
        edad =  Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        if (edad >= mayorEdad && edad <=100){
            JOptionPane.showMessageDialog(null,"eres mayor de edad");
        }
        else if(edad > 0 && edad < mayorEdad){
            JOptionPane.showMessageDialog(null,"eres menor de edad");
        }
        else{
            JOptionPane.showMessageDialog(null,"datono valido, se cayo el sistema por tu culpa");
        }
    }
    
}
