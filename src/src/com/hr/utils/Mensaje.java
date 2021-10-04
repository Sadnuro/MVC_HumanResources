/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.hr.utils;

/**
 *
 * @author HP
 */
public class Mensaje {
    private int codigo;
    private String msg;
    
    public Mensaje(int codigo, String msg){
        this.codigo = codigo;
        this.msg = msg;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getMsg(){
        return this.msg;
    }
    public void setMsg(String msg){
        this.msg = msg;
    }
}
