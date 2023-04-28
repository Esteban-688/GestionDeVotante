
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
  
    //funciones
    
    //si existe la mesa pedida, retona true, si no retorna false
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
    
   // public int obtenerTotalHashmap(){
    //    return valparaiso.size();
    //}
   
    //muestra todo
    public void mostrarTodo(){
        //Se recorre el mapa de mesas
        for (Integer key: valparaiso.keySet()){
            //aca se hace uso de imprimir mesa por mesa
            System.out.println("_____________________");
            System.out.println("");
            System.out.println("      MESA " + key);
            if(valparaiso.get(key).imprimirMesa()==false){
                System.out.println("      VACIA    ");
            }
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
    
    public void buscarRut(String rut) {
        //Se recorre el mapa de mesas
        for (Integer key: valparaiso.keySet()){
             valparaiso.get(key).imprimirPersona(rut);    
        }
    }
    
    public Boolean eliminarPorRut(String rut) { 
        //Se recorre el mapa de mesas
        for (Integer key: valparaiso.keySet()){
            //con esa funcion lo busca y elimina al votante por su rut
            //retorna true si lo borra, sino false
            if(valparaiso.get(key).eliminarPersonaDeMesa(rut) == false){
                System.out.println("no se encontro rut");
                return false;
            } 
        }
        return true;
    }

    public void eliminarMesa(int numeroMesa){
            valparaiso.remove(numeroMesa);
            System.out.println("¡Mesa borrada con éxito!\n");
    }  
    
}
    