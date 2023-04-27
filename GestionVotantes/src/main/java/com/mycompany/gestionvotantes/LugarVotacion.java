
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
    private HashMap<Integer, Mesa> valparaiso = new HashMap<>();
    private BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    
    //funciones
    
    //si existe la mesa pedida, retona true, si no retorna false
    public boolean mesaExiste(int id){
        if(valparaiso.get(id) == null){
            return false;
        }
        return true;
    }
    //esta funcion agreaa un votante con su id a la Mesa ya existente
    public void agregarVotanteAMesa(Votante nuevoVotante, int id){
        valparaiso.get(id).agregarVotanteAMesa(nuevoVotante);
    }
    //con esta fucncion mete la mesa al Hashmap
    public void crearMesa(Mesa nuevaMesa){
        valparaiso.put(nuevaMesa.getId(), nuevaMesa);
    }
    public Mesa obtenerMesa(int key){
        return valparaiso.get(key);
    }
    public int obtenerTotalHashmap(){
        return valparaiso.size();
    }
    /*retorna true si existe mesa, en caso de que no exista false y crea la mesa
    public boolean agregarMesa() throws IOException{
        Mesa nuevaMesa = new Mesa();
        nuevaMesa.crearMesa();
       //comprobar si existe una mesa 
        if(!valparaiso.containsKey(nuevaMesa.getId())){
            //si no existe, se ingresa la mesa con la id al mapa
            valparaiso.put(nuevaMesa.getId(), nuevaMesa);
            System.out.println("Se agrego a una nueva mesa: " + nuevaMesa.getId());
            return false;
        }
        //si existe la mesa se usa el metodo agregarVotanteAMesa para ingresarlo a la mesa existente
        int index = 0;
        valparaiso.get(nuevaMesa.getId()).agregarVotanteAMesa(nuevaMesa.obtenerVotante(index));
            System.out.println("Se añadio a la mesa existente: " + nuevaMesa.getId());
        return true;
    }*/
    
    
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
                    
                    Object[] fila = {valparaiso.get(key).obtenerVotante(i).getName(), valparaiso.get(key).obtenerVotante(i).getRut(), valparaiso.get(key).obtenerVotante(i).getNMesa()};
                    
                    modelo.addRow(fila);
                }
            }
    
}
    public void mostrarMesa(int id) throws IOException {
        //luego con el .get(id) obtengo el objeto "Mesa" desde el hashMapa
        //luego con .imprimirMesa se imprimi el arrayList
        valparaiso.get(id).imprimirMesa();
    }
    
    public void buscarRut(String rut) {
        //Se recorre el mapa de mesas
        for (Integer key: valparaiso.keySet()){
             valparaiso.get(key).imprimirVotante(rut);    
        }
    }
    
    public Boolean eliminarPorRut(String rut) { 
        //Se recorre el mapa de mesas
        for (Integer key: valparaiso.keySet()){
            //con esa funcion lo busca y elimina al votante por su rut
            //retorna true si lo borra, sino false
            if(valparaiso.get(key).eliminarVotanteDeMesa(rut) == false){
                System.out.println("no se encontro rut");
                return false;
            } 
        }
        return true;
    }/*

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
    