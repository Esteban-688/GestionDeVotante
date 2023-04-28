
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
    /* HashMap de mesas */
    private HashMap<Integer, Mesa> valparaiso = new HashMap<>();
    
    /* Funciones */
    
    // Se comprueba si existe la mesa
    public boolean mesaExiste(int id) {
        if(valparaiso.get(id) == null) return false;
        return true;
    }

    // Método para agregar un votante con su id a una mesa ya existente
    public void agregarVotanteAMesa(Votante nuevoVotante, int id){
        valparaiso.get(id).agregarVotanteAMesa(nuevoVotante);
    }

    // Método para ingresar la mesa al HashMap
    public void crearMesa(Mesa nuevaMesa){
        valparaiso.put(nuevaMesa.getId(), nuevaMesa);
    }

    // Método para obtener una mesa a partir de su clave
    public Mesa obtenerMesa(int key) {
        return valparaiso.get(key);
    }

    // Método para obtener el tamaño del HashMap
    public int obtenerTotalHashmap() {
        return valparaiso.size();
    }
   
    // Método que muestra todas las mesas
    public void mostrarTodo() {
        // Se imprime mesa por mesa
        for (Integer key: valparaiso.keySet()) {
            System.out.println("_____________________");
            System.out.println("");
            System.out.println("      MESA " + key);
            if(valparaiso.get(key).imprimirMesa() == false) {
                System.out.println("      VACIA    ");
            }
            System.out.println("_____________________");
        }
    }

    // Método para recorrer todas las mesas
    public void recorrerHashmap(DefaultTableModel modelo) {
        for (Integer key: valparaiso.keySet()) {
            for(int i = 0; i < valparaiso.get(key).obtenerTotal(); i++){
                Object[] fila = { valparaiso.get(key).obtenerVotante(i).getName(), valparaiso.get(key).obtenerVotante(i).getRut(), valparaiso.get(key).obtenerVotante(i).getNMesa() };
                    modelo.addRow(fila);
            }
        }
    }

    // Método para obtener los votantes de una mesa
    public void mostrarMesa(int id) throws IOException {
        /* Con el .get(id) obtengo el objeto "Mesa" desde el HashMap
           luego con .imprimirMesa se imprime el arrayList de votantes*/
        valparaiso.get(id).imprimirMesa();
    }
    
    //Método para buscar por rut e imprimir los datos del votante
    public void buscarRut(String rut) {
        for (Integer key: valparaiso.keySet()){
             valparaiso.get(key).imprimirVotante(rut);    
        }
    }
    
    //Método para eliminar un votante a través del rut
    public Boolean eliminarPorRut(String rut) { 
        for (Integer key: valparaiso.keySet()) {
            // Retorna true si lo borra. De lo contrario, false
            if(valparaiso.get(key).eliminarVotanteDeMesa(rut) == false) {
                System.out.println("No se encontró rut");
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
    