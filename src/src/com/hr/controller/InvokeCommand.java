/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.hr.controller;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import src.com.hr.utils.Mensaje;

/**
 *
 * @author HP
 */
public class InvokeCommand {
    // Recibe un [action] (Nombre de clase) que se tomará crear
    // una instancia de la clase que corresponda al [action] y pasarle el objeto
    // De esta forma se puede ejecutar cualquier acción del controlador
    
    public static Mensaje ejecutar(String action, Object o) throws ClassNotFoundException, ClassCastException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("action: " + action);
        
        // Crea la ruta de la clase extendida [action] que se reciba
        String classToExecute= "src.com.hr.controller."+action+"Action";
        
        // Crea una instancia de la clase extendida [action]
        Class controller = Class.forName(classToExecute);
        
        // Convierte a tipo Action la instancia creada
        Constructor constructor = (Constructor) controller.getConstructor();
        
        Action action1 = (Action) constructor.newInstance();
        
        // Pasa un objeto a la instancia tipo [Action]
        // y con esto se consigue ejecutar cualquier acción crud que se tenga programada
        // En el método abstracto command()
        action1.setObj(o);
        return action1.command();
    }
    
}
