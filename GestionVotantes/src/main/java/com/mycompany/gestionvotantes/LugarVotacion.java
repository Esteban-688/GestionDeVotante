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
        int id = nuevaMesa.getId();
       //comprobar si existe una mesa 
        if(!valparaiso.containsKey(id)){
            //si no existe, se ingresa la mesa con la id al mapa
            valparaiso.put(id, nuevaMesa);
            System.out.println("Se agrego a una nueva mesa: " + id);
            return false;
        }
        //si existe la mesa se usa el metodo agregarVotanteAMesa para ingresarlo a la mesa existente
        int index = 0;
        valparaiso.get(id).agregarVotanteAMesa(nuevaMesa.obtenerVotante(index));
            System.out.println("Se añadio a la mesa existente: " + id);
        return true;
    }
    
    

    public void mostrarTodo(){


        //Se recorre el mapa de mesas
        for (Integer key: valparaiso.keySet()){
            Mesa mesaV = new Mesa(key);
            mesaV = valparaiso.get(key);
            //aca se hace uso de imprimir mesa por mesa
            mesaV.imprimirMesa();
        }
    }
    
    public void mostrarMesa() throws IOException {
        
        //con este metodo de pide la id de mesa y tambien se valida que este dentro de los parametros
        int id = verificarId();
        //luego con el .get(id) obtengo el objeto mesa desde el hashMap
        // al hacerle .obtenerLista a lo anterior logro obtener el Arraylist dentro de la mesa
        //luego con imprimir mesa se imprmi el arrayList
        valparaiso.get(id).imprimirMesa();
    }
    
    public void buscarRut() throws IOException {
        String rut;
        System.out.print("Ingrese el RUT a buscar: ");
        rut = leer.readLine();
        System.out.println();
        
        //Se recorre el mapa de mesas
        for (Integer key: valparaiso.keySet()){
             valparaiso.get(key).imprimirVotante(rut);
        }
    }/*
    
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
    
    //validar que el numero que se ingrese es valido dentro de los parametros
    public int verificarId()throws IOException{
        
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
    