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
public class Estudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=1;
        int i;
        
        Estudiante alumno[]=new Estudiante[a];
        
        for(i=0; i<alumno.length; i++){
            alumno[i] = new Estudiante();
            alumno[i].setLegajo(Integer.valueOf(JOptionPane.showInputDialog("Ingrese legajo: ")));
            alumno[i].setNombre(JOptionPane.showInputDialog("Ingrese nombre: "));
            alumno[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese edad(en años): ")));
            alumno[i].setCurso(JOptionPane.showInputDialog("Ingrese curso: "));
        }
        for(i=0; i<alumno.length; i++){
            JOptionPane.showMessageDialog(null, alumno[i].getLegajo()+", " + alumno[i].getNombre()+", "+alumno[i].getEdad()+" años, "+alumno[i].getCurso());
        }   
    }
    
}
