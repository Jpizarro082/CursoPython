package estrcontrolswitch;

import javax.swing.JOptionPane;

public class EstrControlSwitch {

    public static void main(String[] args) {
        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero del 1 al 5"));
        switch (dato) {
            case 1: JOptionPane.showMessageDialog(null,"el 1, en romano es I");
                    break;
            case 2: JOptionPane.showMessageDialog(null,"el 2, en romano es II");
                    break;
            case 3: JOptionPane.showMessageDialog(null,"el 3, en romano es III");
                    break;
            case 4: JOptionPane.showMessageDialog(null,"el 4, en romano es IV");
                    break;
            case 5: JOptionPane.showMessageDialog(null,"el 5, en romano es V");
                    break;
            default: JOptionPane.showMessageDialog(null,"número fuera de rango");
                    break;
        }
    }
    
}
