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
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public void agregarMesa(LugarVotacion valpo)throws IOException{
        
                        HashMap <Integer,Mesa> auxV = new HashMap<>();
                        auxV = valpo.getValparaiso();
                        int id = 0;
                        System.out.println("Introduzca el Número de la Mesa \n");
                        id = Integer.parseInt(leer.readLine());
                        //comprabacion de si la mesa ya esta creada
                        if(!auxV.containsKey(id)){
                           Mesa nuevoM = new Mesa(id);
                            valparaiso.put(id, nuevoM); 
                           }
                        Mesa mesaVotante = new Mesa(id);
                        mesaVotante=auxV.get(id);
                        mesaVotante.agregarVotante(id); 
        
    }    
    public void mostrarTodo(LugarVotacion valpo){
        
        HashMap <Integer,Mesa> auxV = new HashMap<>();
        auxV = valpo.getValparaiso();
        for (Integer key: auxV.keySet()){
            Mesa mesaV = new Mesa(key);
            mesaV = auxV.get(key);
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
    