
package com.mycompany.gestionvotantes;

import java.io.*;
import java.util.*;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author esteb
 */

public class LugarVotacion {
    //contiene un HASHMAP donde almacena todas las mesas
    private HashMap<Integer, Mesa> valparaiso = new HashMap<>();
    
    //contructor sin parametros solo para crear las mesas automaticas
    public LugarVotacion(){
        crear10Mesas();
    }
    //funciones
    
    //creacion de 10 mesas automaticas para no hacerlo manual
    public void crear10Mesas(){
        for(int i = 1; i<=10; i++){
            Mesa nuevaMesa = new Mesa(i);
            valparaiso.put(i, nuevaMesa);
        }
    }
    
   /**
 * ver si existe la mesa
 * 
 * @param num El número de mesa
 * @return si existe la mesa pedida, retona true, si no retorna false
 */
    public boolean mesaExiste(int id){ 
        if(valparaiso.get(id) == null){
            return false;
        }
        return true;
    }
    //esta funcion agreaa un votante con su id a la Mesa ya existente
    public void agregarPersonaAMesa(Persona nuevoVotante, int id){
        valparaiso.get(id).agregarPersonaAMesa(nuevoVotante);
    }
    
    //con esta fucncion mete la mesa al Hashmap
    public void crearMesa(Mesa nuevaMesa){
        valparaiso.put(nuevaMesa.getId(), nuevaMesa);
    }
    
    public Mesa obtenerMesa(int key){
        return valparaiso.get(key);
    }
    
    public boolean vocalEnMesa(int id){
        
        if(valparaiso.get(id).retonarSiExisteVocal()){
            //existe vocal en mesa
          return true;
        }
       return false;
    }
    //muestra todo
    public void mostrarTodo(){
        //Se recorre el mapa de mesas
        for (Integer key: valparaiso.keySet()){
            //aca se hace uso de imprimir mesa por mesa
            System.out.println("_____________________");
            System.out.println("");
            System.out.println("      MESA " + key);
            valparaiso.get(key).imprimirMesa();
             System.out.println("_____________________");
        }
    }
    public void recorrerHashmap(DefaultTableModel modelo){
    for (Integer key: valparaiso.keySet()) {
                for(int i = 0; i < valparaiso.get(key).obtenerTotal(); i++){
                    
                    Object[] fila = {valparaiso.get(key).obtenerPersona(i).getName(), valparaiso.get(key).obtenerPersona(i).getRut(), valparaiso.get(key).obtenerPersona(i).getNMesa()};
                    
                    modelo.addRow(fila);
                }
            }
    
}
    public void mostrarMesa(int id){
        //luego con el .get(id) obtengo el objeto "Mesa" desde el hashMapa
        //luego con .imprimirMesa se imprimi el arrayList
        valparaiso.get(id).imprimirMesa();
    }
    
    public Persona buscarRut(String rut, boolean a) {
        //Se recorre el mapa de mesas
        //si es true viene de ventana, si es false viene de consola
        
        //true Ventana : false consola
            for (Integer key: valparaiso.keySet()){
                return valparaiso.get(key).imprimirPersona(rut, a);    
            }
        return null;
    }
    
    public boolean cambiaVotantePorVocal(String rut, String contraseña){
        for (Integer key : valparaiso.keySet()){
            if(valparaiso.get(key).transformarVotanteAVocal(rut,contraseña)){
                return true;
            }
        }
        return false;
    }
    
    public void eliminarPorRut(String rut) { 
        //Se recorre el mapa de mesas
        for (Integer key: valparaiso.keySet()){
            //con esa funcion lo busca y elimina al persona por su rut
            //retorna true si lo borra, sino false
            valparaiso.get(key).eliminarPersonaDeMesa(rut);
        }
        
    }
    //sobrecarga de metodo
    // si el valor el true, solo elimine votantes: False, solo elimina vocales
    public void eliminarPorRut(String rut , boolean a){
        
        //eliminar votante(true);eliminar vocal(false)
        for (Integer key: valparaiso.keySet()){
        //con esa funcion lo busca y elimina una persona(votante(true) / vocal(false) por su rut
        //retorna true si lo borra, sino false
            valparaiso.get(key).eliminarPersonaDeMesa(rut, a);
        }
        
    }

    public void eliminarMesa(int numeroMesa){
            valparaiso.remove(numeroMesa);
            System.out.println("¡Mesa borrada con éxito!\n");
    }  
    
}
    