/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.hr.model;

import java.util.Objects;

/**
 *
 * @author HP
 */
public class Cargo {
    private int id;
    private String nombre;
   
    public Cargo(){
        
    }
    
    public Cargo(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    public int getId(){
       return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public boolean equals(Object o){
        if (o==this){
            return true;
        }
        if(!(o instanceof Cargo)){
            return false;
        }
        
        Cargo cargo = (Cargo) o;
        return id==cargo.getId();
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(id, nombre);
    }
    
    @Override
    public String toString(){
        return "{" +
                "id='" +getId() +"'" +
                ", nombre='"+ getNombre() + "'" +
                "}";
    }    
}
