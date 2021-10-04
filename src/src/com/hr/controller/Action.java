/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.hr.controller;

import src.com.hr.utils.Mensaje;

/**
 *
 * @author HP
 */
public abstract class Action {
    protected Object obj;
    
    public Object getObj(){
        return this.obj;
    }
    public void setObj(Object obj){
        this.obj = obj;
    }
    
    // Los métodos abstractos no se implementan, solo se definen
    public abstract Mensaje command();
}
