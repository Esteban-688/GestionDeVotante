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
    }
    
    

    public void mostrarTodo(){
        //Se recorre el mapa de mesas
        for (Integer key: valparaiso.keySet()){
            //aca se hace uso de imprimir mesa por mesa
            valparaiso.get(key).imprimirMesa();
        }
    }
    
    public void mostrarMesa() throws IOException {
        
        //con este metodo de pide la id de mesa y tambien se valida que este dentro de los parametros
        int id = verificarId();
        //luego con el .get(id) obtengo el objeto "Mesa" desde el hashMapa
        //luego con .imprimirMesa se imprimi el arrayList
        valparaiso.get(id).imprimirMesa();
    }
    
    public void buscarRut() throws IOException {
        String rut;
        System.out.println ("Ingrese el RUT a buscar: ");
        rut = leer.readLine();
        System.out.println();
        
        //Se recorre el mapa de mesas
        for (Integer key: valparaiso.keySet()){
             valparaiso.get(key).imprimirVotante(rut);
             
        }
    }
    
    public void eliminarPorRut() throws IOException {
        //declaration variable
        String rut;
        //Se pide el rut del votante a borrar
        System.out.println("Ingrese RUT a borrar: ");
        rut = leer.readLine();
        System.out.println();
        
        //Se recorre el mapa de mesas
        for (Integer key: valparaiso.keySet()){
            //con esa funcion lo busca y elimina al votante por su rut
            //retorna true si lo borra, sino false
            if(valparaiso.get(key).eliminarVotanteDeMesa(rut) == false){
                System.out.println("no se encontro rut");
            }
           
            
            
        }
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
    
    //validar que el numero que se ingrese es valido dentro de los parametros
    private int verificarId()throws IOException{
        
        int id = 0;//numero de mesa
        boolean esNumeroValido = false;

        // Validar el número ingresado por el usuario
        while (!esNumeroValido) {
            System.out.println("Introduzca Número de mesa: ");
            String entradaId = leer.readLine();

            // Verificar si la entrada es un número entero
            try {
                
                id = Integer.parseInt(entradaId);
                esNumeroValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            }
        }
       return id;
    }
}
    