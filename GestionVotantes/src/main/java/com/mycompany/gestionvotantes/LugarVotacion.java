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
     
    public void agregarMesa(LugarVotacion valpo, int id, String name, int rut){
        HashMap <Integer,Mesa> auxV = new HashMap<>();
        auxV = valpo.getValparaiso();
        //comprabacion de si la mesa ya esta creada
        if(!auxV.containsKey(id)){
         Mesa nuevoM = new Mesa(id);
         valparaiso.put(id, nuevoM); 
        }
        Mesa mesaVotante = new Mesa(id);
        mesaVotante=auxV.get(id);
        mesaVotante.agregarVotante(rut, name, id);
        
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
    
    public void mostrarMesa(LugarVotacion valpo)throws IOException{
        HashMap <Integer,Mesa> auxV = new HashMap<>();
        auxV = valpo.getValparaiso();
        int id = 0;
        System.out.println("Introduzca el Número de la Mesa \n");
        id = Integer.parseInt(leer.readLine());
        Mesa mesaV = new Mesa(id);
        mesaV = auxV.get(id);
        ArrayList mesaVotante = new ArrayList();
        mesaVotante = mesaV.getMesaVotante();
        mesaV.imprimirMesa(mesaVotante);
    }
    
    public void buscarRut(LugarVotacion valpo)throws IOException{
        HashMap <Integer,Mesa> auxV = new HashMap<>();
        System.out.println("Ingrese Rut a buscar");
        int rut;
        rut = Integer.parseInt(leer.readLine());
        auxV = valpo.getValparaiso();
        
        for (Integer key: auxV.keySet()){
            Mesa mesaV = new Mesa(key);
            mesaV = auxV.get(key);
            ArrayList mesaVotante = new ArrayList();
            mesaVotante = mesaV.getMesaVotante();
            mesaV.imprimirVotante(mesaVotante, rut);
        }
    }
    public void eliminarRut(LugarVotacion valpo)throws IOException{
        HashMap <Integer,Mesa> auxV = new HashMap<>();
        System.out.println("Ingrese Rut a borrar");
        int rut;
        rut = Integer.parseInt(leer.readLine());
        auxV = valpo.getValparaiso();
        
        for (Integer key: auxV.keySet()){
            Mesa mesaV = new Mesa(key);
            mesaV = auxV.get(key);
            ArrayList mesaVotante = new ArrayList();
            mesaVotante = mesaV.getMesaVotante();
            mesaV.eliminarVotante(mesaVotante, rut);
        }
    }
    public void eliminarMesa(LugarVotacion valpo)throws IOException{
        HashMap <Integer,Mesa> auxV = new HashMap<>();
        System.out.println("Ingrese Número de mesa a Borrar\n");
        int  nMesa;
        nMesa = Integer.parseInt(leer.readLine());
        auxV.remove(nMesa);
    }
    
    public HashMap<Integer, Mesa> getValparaiso() {
        return valparaiso;
    }
 
    public void setValparaiso(HashMap<Integer, Mesa> valparaiso) {
        this.valparaiso = valparaiso;
    }
    
}
    