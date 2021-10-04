/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.com.hr.dao;
import java.util.List;

/**
 * @author Sadith Nunez Rocha
 * MISION TIC 2022 | 2021
 * @param <T>
 * @param <I>
 */

/* La interface DAO es genérica, por lo tanto solo define los métodos
* la función de cada método se construye en la implementación de cada interface extendida de Dao
* Ejemplo:
* 1. Dao
* 2. EmpleadoDao extends Dao<Empleado, Integer>
* 3. EmpleadoDaoImpl extends EmpleadoDao 
*    Sobreescribe los métodos heredados de Dao > EmpleadoDao >
*    con una construcción propia de la estructura de datos que pretende buscar
*    retornar, actualizar, crear, etc.
*
* Cada implementación de una interface extendida de DAO tendrá su propia 
* sobreescritura al tener su propia estructura de datos
*/

// <> : Generico | <T> : Template
public interface Dao<T, I> {
    // Methods
    // Datatype | name | params
    int guardar(T object);
    int actualizar (T object);
    int eliminar (T object);
    
    // Lista de cualquier T : Objeto
    // Datatype | name | params
    List<T> buscar();
    T buscar(I i);      // i: int   
}
