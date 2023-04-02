/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionvotantes;

import java.io.*;
import java.util.*;
import java.util.HashMap;

/**
 *
 * @author esteb
 */

public class LugarVotacion {
    private HashMap<Integer, Mesa> valparaiso = new HashMap<>();
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
     
    public void agregarMesa(LugarVotacion valpo, int id, String name, int rut) {
        HashMap <Integer, Mesa> auxV = new HashMap<>();
        auxV = valpo.getValparaiso();

        //Se comprueba si la mesa ya está creada
        if(!auxV.containsKey(id)) {
            Mesa nuevoM = new Mesa(id);
            valparaiso.put(id, nuevoM); 
        }

        //Se agrega el votante
        Mesa mesaVotante = new Mesa(id);
        mesaVotante = auxV.get(id);
        mesaVotante.agregarVotante(rut, name, id);
        
    }
    
    public void agregarMesa(LugarVotacion valpo) throws IOException {
        int id;
        HashMap <Integer, Mesa> auxV = new HashMap<>();
        auxV = valpo.getValparaiso();

        //Se pide la mesa
        System.out.print("Introduzca el número de la mesa: ");
        id = Integer.parseInt(leer.readLine());

        //Se comprueba si la mesa ya esta creada
        if(!auxV.containsKey(id)) {
            Mesa nuevoM = new Mesa(id);
            valparaiso.put(id, nuevoM); 
        }

        //Se agrega el votante
        Mesa mesaVotante = new Mesa(id);
        mesaVotante = auxV.get(id);
        mesaVotante.agregarVotante(id);
    }

    public void mostrarTodo(LugarVotacion valpo) {
        HashMap <Integer, Mesa> auxV = new HashMap<>();
        auxV = valpo.getValparaiso();

        //Se recorre el mapa de mesas
        for (Integer key: auxV.keySet()){
            Mesa mesaV = new Mesa(key);
            mesaV = auxV.get(key);

            //Se muestra cada una de las mesas con sus votantes
            ArrayList mesaVotante = new ArrayList();
            mesaVotante = mesaV.getMesaVotante();
            mesaV.imprimirMesa(mesaVotante);
        }
    }
    
    public void mostrarMesa(LugarVotacion valpo) throws IOException {
        int id;
        HashMap <Integer, Mesa> auxV = new HashMap<>();
        auxV = valpo.getValparaiso();

        //Se pide la mesa a buscar
        System.out.print("Introduzca el número de la mesa: ");
        id = Integer.parseInt(leer.readLine());
        System.out.println();

        //Se obtiene el mapa de mesas
        Mesa mesaV = new Mesa(id);
        mesaV = auxV.get(id);

        //Se muestran los votante de la mesa
        ArrayList mesaVotante = new ArrayList();
        mesaVotante = mesaV.getMesaVotante();
        mesaV.imprimirMesa(mesaVotante);
    }
    
    public void buscarRut(LugarVotacion valpo) throws IOException {
        int rut;
        HashMap <Integer, Mesa> auxV = new HashMap<>();
        auxV = valpo.getValparaiso();

        System.out.print("Ingrese el RUT a buscar: ");
        rut = Integer.parseInt(leer.readLine());
        System.out.println();
        
        //Se recorre el mapa de mesas
        for (Integer key: auxV.keySet()){
            Mesa mesaV = new Mesa(key);
            mesaV = auxV.get(key);

            //Se muestra el votante
            ArrayList mesaVotante = new ArrayList();
            mesaVotante = mesaV.getMesaVotante();
            mesaV.imprimirVotante(mesaVotante, rut);
        }
    }
    
    public void eliminarRut(LugarVotacion valpo) throws IOException {
        int rut;
        HashMap <Integer, Mesa> auxV = new HashMap<>();
        auxV = valpo.getValparaiso();

        //Se pide el rut del votante a borrar
        System.out.print("Ingrese RUT a borrar: ");
        rut = Integer.parseInt(leer.readLine());
        System.out.println();
        
        //Se recorre el mapa de mesas
        for (Integer key: auxV.keySet()){
            Mesa mesaV = new Mesa(key);
            mesaV = auxV.get(key);

            //Se elimina el votante
            ArrayList mesaVotante = new ArrayList();
            mesaVotante = mesaV.getMesaVotante();
            mesaV.eliminarVotante(mesaVotante, rut);
        }
    }

    public void eliminarMesa(LugarVotacion valpo) throws IOException {
        int nMesa;
        HashMap <Integer, Mesa> auxV = new HashMap<>();
        auxV = valpo.getValparaiso();

        //Se pide la mesa a borrar
        System.out.print("Ingrese número de mesa a borrar: ");
        nMesa = Integer.parseInt(leer.readLine());
        System.out.println();

        //Se comprueba de que exista la mesa. Si existe, se borra
        if(auxV.containsKey(nMesa)) {
            auxV.remove(nMesa);
            System.out.println("¡Mesa borrada con éxito!\n");
        }
    }
    
    public HashMap<Integer, Mesa> getValparaiso() {
        return valparaiso;
    }
 
    public void setValparaiso(HashMap<Integer, Mesa> valparaiso) {
        this.valparaiso = valparaiso;
    }
    
}
    