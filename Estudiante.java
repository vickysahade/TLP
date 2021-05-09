/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laptop
 */
public class Estudiante {
    private int legajo;
    private String nombre;
    private int edad;
    private String curso;
    
    public Estudiante(){}
    
    public void setLegajo(int legajo){
        this.legajo = legajo;
    }
    public int getLegajo(){
        return this.legajo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setCurso(String curso){
        this.curso=curso;
    }
    public String getCurso(){
        return this.curso;
    }
}
