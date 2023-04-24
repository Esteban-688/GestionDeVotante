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
    private BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    
    
    //retorna true si existe mesa, en caso de que no exista false y crea la mesa
    public boolean agregarMesa()throws IOException{
        Mesa auxMesa = new Mesa();
        int id = auxMesa.getId();
       //comprobar si existe una mesa 
        if(!valparaiso.containsKey(id)){
            //si no existe, se ingresa la mesa con la id al mapa
            valparaiso.put(id, auxMesa);
            System.out.println("Se agrego a una nueva mesa: " + id);
            return false;
        }
        //si existe la mesa se usa el metodo agregarVotanteAMesa para ingresarlo a la mesa existente
        valparaiso.get(id).agregarVotanteAMesa(auxMesa.obtenerLista());
            System.out.println("Se añadio a la mesa existente: " + id);
        return true;
    }
    
    

    public void mostrarTodo(){


        //Se recorre el mapa de mesas
        for (Integer key: valparaiso.keySet()){
            Mesa mesaV = new Mesa(key);
            mesaV = valparaiso.get(key);
            /*
            //Se muestra cada una de las mesas con sus votantes
            ArrayList mesaVotante = new ArrayList();
            mesaVotante = mesaV.obtenerLista();*/
            mesaV.imprimirMesa(mesaV.obtenerLista());
        }
    }
    /*
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
    }  */
}
    