/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.hr.impl;

import java.util.ArrayList;
import java.util.List;
import src.com.hr.dao.EmpleadoDao;
import src.com.hr.model.Empleado;

/**
 *
 * @author HP
 */
public class EmpleadoDaoImpl implements EmpleadoDao {
    
    // Fuente de datos
    // Dinamic array from object type or numeric datatypes
    private static ArrayList<Empleado> sEmpleados = new ArrayList<>();
    // Static array from object type or numeric datatypes
    // Empleado[] empleados = new Empleado[10000];
    
    @Override
    public int guardar(Empleado object){
        /* Validacion e objeto ya guardado
        *   Al haber implementado en la clase Empleado el método equals(),
        *   el método contains() hace uso de él y recibe una confirmación según la validación
        *   realizada en Empleado.equals()
        */
        if (!sEmpleados.contains(object))  { // Si no lo encuentra lo agrega
            sEmpleados.add(object);
            show();
            return 1;
        }
        return 0;
    }
    
    @Override
    public int actualizar(Empleado object){
        for(int j=0; j<sEmpleados.size(); j++ ){
            if (sEmpleados.get(j).equals(object)){
                sEmpleados.set(j, object);
                return 1;
            }
        }
        return 0;
    }
    
    @Override
    public int eliminar(Empleado object){
        boolean sw = sEmpleados.remove(object);
        if (sw)
            return 1;
        
        return 0;
    }
    
    @Override
    public List<Empleado> buscar() {
        
        return sEmpleados;
    }
    
    @Override
    public Empleado buscar(Integer i){
        for(int j=0; j<sEmpleados.size(); j++){
            if (sEmpleados.get(j).getId()==i){
                return sEmpleados.get(j);
            }  
        }
        return null;
    }
    
    private void show(){
        for(Empleado e:sEmpleados){
            System.out.println(e);
        }
    }
}
