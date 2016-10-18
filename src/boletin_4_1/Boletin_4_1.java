
package boletin_4_1;

import javax.swing.JOptionPane;

public class Boletin_4_1 {

    public static void main(String[] args) {
        Coche co1 = new Coche();
        
        
        co1.frenar(50);
        co1.acelerar(80);
        
    int velocidad = co1.getVelocidade();
    JOptionPane.showMessageDialog(null,"El coche se mueve a una velocidad de "+velocidad+" kilometros por hora");
    }
    
}
