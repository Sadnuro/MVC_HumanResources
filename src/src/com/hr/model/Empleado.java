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

// NOTA: 01 | Clase Objects heredado IMPLÍCITAMENTE
// public class Empleado extends Object(){};
public class Empleado {     // POJOs
    private int id;
    private String nombres;
    private String apellidos;
    private double salario;
    
    public Empleado (){
        
    }
    
    public Empleado(int id, String nombres, String apellidos, double salario){
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.salario = salario;
    }
    
    
    public int getId (){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombres (){
        return this.nombres;
    }
    public void setNombres(String nombres){
        this.nombres = nombres;
    }
    
    public String getApellidos (){
        return this.apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public double getSalario (){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    // NOTA:02 | método equels() perteneciente a Objects
    @Override 
    public boolean equals(Object o) {
        if(o==this){
            return true;
        }
        if (!(o instanceof Empleado)){
            return false;
        }
        Empleado empleado = (Empleado) o;
        return id==empleado.id;
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(id, nombres, apellidos, salario);
    }
    
    // All empleado returned is converted toString();
    @Override
    public String toString(){
        return "{" +
                "id='" +getId() +"'" +
                ", nombres='"+ getNombres() + "'" +
                ", apellidos='" + getApellidos() +"'" +
                ", salario='"+ getSalario() + "'" +
                "}";
    }
    
    
    
}