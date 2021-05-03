/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.sahadevictoria;

/**
 *
 * @author pc04
 */
public class perro {
    int a =1;
    private String nombre;
    private int edad;
    private String raza;
    
    public perro(String nombre, int edad, String raza){
        this.nombre=nombre;
        this.edad=edad;
        this.raza=raza;
     }   

    public String getNombre() {
        return(this.nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return (this.edad);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setRaza(){
        this.raza=raza;
    }
    public String getRaza(){
        return (this.raza);
    }
    
    perro Labrador[]=new perro[a];
    for(int=0; i<Labrador.length;i++)
    
    {Labrador[i]=new perro();  
    Labrador[i].setNombre(JOptionPane.showInputDialog("ingrese el nombre"));
    Labrador[i].set
    }  
}
