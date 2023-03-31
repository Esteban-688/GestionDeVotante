/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionvotantes;

import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author esteb
 */
public class LugarVotacion {
     private HashMap<Integer , Mesa> valparaiso = new HashMap<>();
     
    public void agregarMesa(Integer id){
        Mesa nuevoM = new Mesa((int)id);
        valparaiso.put(id, nuevoM);
    }
    
    public void agregarMesa(int id){
        Mesa nuevoM = new Mesa(id);
        valparaiso.put(id, nuevoM); 
    }    
    public void mostrarTodo(HashMap<Integer , Mesa> valparaiso){
        for (Integer key: valparaiso.keySet()){
            Mesa mesaV = new Mesa(key);
            mesaV = valparaiso.get(key);
            ArrayList mesaVotante = new ArrayList();
            mesaVotante = mesaV.getMesaVotante();
            mesaV.imprimirMesa(mesaVotante);
        
        }
    }
    
    public HashMap<Integer, Mesa> getValparaiso() {
        return valparaiso;
    }
 
    public void setValparaiso(HashMap<Integer, Mesa> valparaiso) {
        this.valparaiso = valparaiso;
    }
    
}
    