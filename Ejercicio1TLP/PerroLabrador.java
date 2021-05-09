/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author laptop
 */
public class PerroLabrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1;
        int i;      
        
        Perro labrador[] = new Perro[a];
        
        for(i=0; i<labrador.length; i++){
            labrador[i] = new Perro();
            labrador[i].setNombre(JOptionPane.showInputDialog("Ingrese nombre: "));
            labrador[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese edad(en años): ")));
            labrador[i].setRaza(JOptionPane.showInputDialog("Ingrese raza: "));
        }
        
        for(i=0; i<labrador.length; i++){
            JOptionPane.showMessageDialog(null, labrador[i].getNombre()+", "+labrador[i].getEdad()+" años, "+labrador[i].getRaza());
        }   
    }
    
}
