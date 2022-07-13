age entradasalidadatosjoptionpane;

import javax.swing.JOptionPane;
public class EntradaSalidaDatosJoptionPane {
  
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        
       cadena =  JOptionPane.showInputDialog("Digite una cadena: ");
       entero = Integer.parseInt(  JOptionPane.showInputDialog("Diigite un entero: "));
       letra = JOptionPane.showInputDialog("digite un caracter: ").charAt (0);
       decimal =Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal : "));
       
       JOptionPane.showMessageDialog(null ,"La cadena es: : "+cadena);
       JOptionPane.showMessageDialog(null ,"La cadena es: : "+entero);
       JOptionPane.showMessageDialog(null ,"La cadena es: : "+letra);
       JOptionPane.showMessageDialog(null ,"La cadena es: : "+decimal);
    }
    
}
