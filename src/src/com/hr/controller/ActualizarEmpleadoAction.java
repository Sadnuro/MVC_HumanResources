/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.hr.controller;

import src.com.hr.dao.Dao;
import src.com.hr.impl.EmpleadoDaoImpl;
import src.com.hr.model.Empleado;
import src.com.hr.utils.Mensaje;

/**
 *
 * @author HP
 */
public class ActualizarEmpleadoAction extends Action {
    private Dao<Empleado, Integer> dao = new EmpleadoDaoImpl();
    private Empleado empleado;
    
    
    public void setObj(Object o){
        empleado = (Empleado) o;
    }
    
    @Override
    public Mensaje command(){
        int exito = dao.actualizar(empleado);
        
        if(exito==1){
            return new Mensaje(101, "Empleado actualizado con éxito!");
        }
        return new Mensaje(201, "El empleado con id: " + empleado.getId() + " no existe");
    }
}
