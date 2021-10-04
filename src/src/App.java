/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import src.com.hr.impl.EmpleadoDaoImpl;
import src.com.hr.model.Empleado;


/**
 *
 * @author HP
 */
public class App {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Todas las instancias EmpleadoDaoImpl acceden a una misma lista
        // Devido a que EmpleadoDaoImpl crea una lista static donde se guardan 
        // los empleados mediante la implementación;
        EmpleadoDaoImpl empImpl1 = new EmpleadoDaoImpl();
        EmpleadoDaoImpl empImpl2 = new EmpleadoDaoImpl();
        
        // Models of data
        Empleado empModel1 = new Empleado(1, "Sadith", "Nunez", 4000000);
        Empleado empModel2 = new Empleado(2, "Jorge Luis", "Nunez", 4000000);
        Empleado empModel3 = new Empleado(3, "Zenaida", "Rocha", 4000000);
        
        
        // Implementations | Storage in database
        empImpl1.guardar(empModel1);
        empImpl1.guardar(empModel2);
        empImpl1.guardar(empModel3);
        
        // Búsqueda
        Empleado empResult = empImpl1.buscar(1);
        if (empResult!=null){
            System.out.println(empResult);
        } else  {
            System.out.println("user not found!");  
        }
        
        // Actualización
        empModel1.setApellidos("Nunez Rocha");
        int updateResult = empImpl1.actualizar(empModel1);
        System.out.println(updateResult);
        
        // Búsqueda
        empResult = empImpl1.buscar(1);
        if (empResult!=null){
            System.out.println(empResult);
        } else  {
            System.out.println("user not found!");  
        }
    }
}
