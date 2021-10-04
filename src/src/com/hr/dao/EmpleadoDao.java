/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.hr.dao;

import src.com.hr.model.Empleado;

/**
 *
 * @author HP
 */

// Hereda los métodos y atributos de la interface Dao, pero
// Personaliza los tipos de datos a recibir: Empleado | Integer.
public interface EmpleadoDao extends Dao<Empleado, Integer> {
    
}
