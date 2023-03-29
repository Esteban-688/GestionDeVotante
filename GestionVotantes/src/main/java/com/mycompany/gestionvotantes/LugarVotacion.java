/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionvotantes;

import java.io.*;
import java.util.*;

/**
 *
 * @author esteb
 */
public class LugarVotacion {
     private HashMap<Integer,Mesa> valparaiso = new HashMap<>();
     
    public void agregarMesa(Integer id){
        Mesa nuevoM = new Mesa((int)id);
        valparaiso.put(id, nuevoM);
    }
    
    public void agregarMesa() throws IOException{
    BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
    int id = 0;
        System.out.println("Introduzca el Número de la Mesa \n");
        id = Integer.parseInt(leer.readLine());
        
        Mesa nuevoM = new Mesa(id);
        valparaiso.put(id, nuevoM);  
    }
    public HashMap<Integer, Mesa> getValparaiso() {
        return valparaiso;
    }

    public void setValparaiso(HashMap<Integer, Mesa> valparaiso) {
        this.valparaiso = valparaiso;
    }
    
}
    