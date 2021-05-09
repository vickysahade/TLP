/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laptop
 */
public class Perro {
    private String nombre;
    private int edad;
    private String raza;
    
     public Perro(){}
    
    //public Perro(String n,int e, String r){
        //this.nombre=n;
       // this.edad=e;
       //this.raza=r;
    //}

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
     public void setEdad(int edad){
        this.edad = edad+1;
     } 
    public int getEdad(){
        return this.edad;
    }
     public void setRaza(String raza){
        this.raza=raza; 
    }
    public String getRaza() {
        return this.raza;
    }
}

