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
public class GuardarEmpleadoAction extends Action {
    private Dao<Empleado, Integer> dao = new EmpleadoDaoImpl();
    private Empleado empleado;
    
    
    public void setObj(Object o){
        empleado = (Empleado) o;
    }
    
    @Override
    public Mensaje command(){
        int exito = dao.guardar(empleado);
        
        if(exito==1){
            return new Mensaje(100, "Empleado guardado conéxito!");
        }
        return new Mensaje(200, "El empleado con id: " + empleado.getId() + " ya existe");
    }
}
