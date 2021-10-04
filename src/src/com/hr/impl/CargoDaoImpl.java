/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.hr.impl;

import java.util.ArrayList;
import java.util.List;
import src.com.hr.dao.CargoDao;
import src.com.hr.model.Cargo;

/**
 *
 * @author HP
 */
public class CargoDaoImpl implements CargoDao{
    private static ArrayList<Cargo> sCargos = new ArrayList<>();
    
   @Override
    public int guardar(Cargo object){
        if(!sCargos.contains(object)){
            sCargos.add(object);
            return 1;
        }
        return 0;
    }
    
    @Override
    public int actualizar (Cargo object){
        for(int j=0; j<sCargos.size(); j++){
            if(sCargos.get(j).equals(object)){
                sCargos.set(j, object);
                return 1;
            }    
        }
        return 0;
    }
    
    @Override
    public int eliminar(Cargo object){
        boolean sw = sCargos.remove(object);
        if(sw){
            return 1;
        }
        return 0;
    }
    
    @Override
    public List<Cargo> buscar(){
        return sCargos;
    }
    
    @Override
    public Cargo buscar(Integer i){
        for (int j=0; j<sCargos.size(); j++){
            if(sCargos.get(j).getId()==i){
                return sCargos.get(j);
            }
        }
        return null;
    }
}
