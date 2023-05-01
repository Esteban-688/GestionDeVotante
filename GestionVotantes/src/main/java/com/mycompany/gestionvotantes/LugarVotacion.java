
package com.mycompany.gestionvotantes;

import java.io.*;
import java.util.*;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

/**
 * Esta clase que guarda un HASHMAP de tipo MESA
 * @author esteb
 */
public class LugarVotacion {
    /**
     * valparaiso es un Hashmap
     * SU Clave es el numero de mesa
     * y guarda Clase tipo Mesa
     */
     private HashMap<Integer, Mesa> valparaiso = new HashMap<>();
    /**
     * Contructor sin parametros solo para crear las mesas automaticas
    */ 
    public LugarVotacion(){
        crear10Mesas();
    }
    /**
     * su Funcion es crear 10 clases mesas automaticas para no hacerlo manual
    */
    public void crear10Mesas(){
        for(int i = 1; i<=10; i++){
            Mesa nuevaMesa = new Mesa(i);
            valparaiso.put(i, nuevaMesa);
        }
    }
    
   /**
 * Su Funcion es comprobar si existe la MESA
 * @param num El número de mesa
 * @return boolean :si existe la mesa pedida, retona TRUE, si no retorna FALSE
 */
    public boolean mesaExiste(int id){ 
        if(valparaiso.get(id) == null){
            return false;
        }
        return true;
    }
    
    /**
     * Su funcion es agrega un votante a la Mesa ya existente
     * @param Persona : recibibe una persona Votante/vocal
     * @param id: es la iD de la mesa que se agrega el votante
    */
    public void agregarPersonaAMesa(Persona nuevoVotante, int id){
        valparaiso.get(id).agregarPersonaAMesa(nuevoVotante);
    }
    
    /**
     * Esta funcion Coloca la Mesa en el Hashmap 
     * @param nuevaMesa es tipo MESA y es la que se agrega
     */
    public void crearMesa(Mesa nuevaMesa){
        valparaiso.put(nuevaMesa.getId(), nuevaMesa);
    }
    /**
     * Esta funcion te regresa una mesa del hashmap
     * @param key es la id o numero de mesa
     * @return Mesa, retorna la mesa segun la id 
     */
    public Mesa obtenerMesa(int key){
        return valparaiso.get(key);
    }
    /**
     * verifica si existe un vocal en Mesa
     * @param id mesa para preguntar si existe vocal
     * @return TRUE Existe vocal/ FALSE NO existe vocal
     */
    public boolean vocalEnMesa(int id){
        
        if(valparaiso.get(id).retonarSiExisteVocal()){
            //existe vocal en mesa
          return true;
        }
       return false;
    }
    
    /**
     * Esta funcion recorre el hashmap e imprime las mesas con sus Persona
     */
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
    /**
     * FUNCION PARA VENTANA
     * Esta funcion recorre el Hashmap y agrega la PERSONA a la tabla dinamica
     * @param modelo es la tabla dinamica
     */
    public void recorrerHashmap(DefaultTableModel modelo){
        for (Integer key: valparaiso.keySet()) {
            for(int i = 0; i < valparaiso.get(key).obtenerTotal(); i++){
                   
              Object[] fila = {valparaiso.get(key).obtenerPersona(i).getName(), valparaiso.get(key).obtenerPersona(i).getRut(), valparaiso.get(key).obtenerPersona(i).getNMesa()};
              //agrega a fila      
              modelo.addRow(fila);
            }
        }
    }
    /**
     * sobrecarga de metodo
     * FUNCION PARA VENTANA
     * Esta funcion recorre el Hashmap y agrega la PERSONA al CSV
     * @param datos es el arraylist donde se agregara
     */
    public void recorrerHashmap(List<String[]> datos){
        for (Integer key: valparaiso.keySet()) {
            for(int i = 0; i < valparaiso.get(key).obtenerTotal(); i++){     
              datos.add(new String[]{valparaiso.get(key).obtenerPersona(i).getName(),valparaiso.get(key).obtenerPersona(i).getRut(),Integer.toString(valparaiso.get(key).obtenerPersona(i).getNMesa())});
            }
        }
    }
    /**
     * Esta funcion solo imprime la mesa pedida
     * @param id Numero de Mesa
     */
    public void mostrarMesa(int id){
        valparaiso.get(id).imprimirMesa();
    }
    
    /**
     *  Se recorre el mapa de mesas
     *si es true RETORNA VOTANTES Y VOCALES, si es false SOLO VOTANTES
     * @param rut identificador de la Persona
     * @param a True (VENTANA), False(CONSOLA)
     * @return un TIPO PERSONA
     */
    public Persona buscarRut(String rut, boolean a) { 
        //true Ventana : false consola
            for (Integer key: valparaiso.keySet()){
                if(valparaiso.get(key).retornarPersona(rut, a) != null){
                    return valparaiso.get(key).retornarPersona(rut, a);
                }
            }
        return null;
    }
    /**
     * funcion para cambiar un votante por el vocal de su misma Mesa
     * tener en cuenta que si es vacio lo agrega sino lo reemplaza
     * @param rut   del Votante
     * @param contraseña    la nueva contraseña que tendra el votante que se convierte Vocal
     * @return  TRUE si logra cambiar / FALSE si no logra cambiarlo 
     */
    public boolean cambiaVotantePorVocal(String rut, String contraseña){
        for (Integer key : valparaiso.keySet()){
            if(valparaiso.get(key).transformarVotanteAVocal(rut,contraseña)){
                return true;
            }
        }
        return false;
    }
    /**
     * Funcion que busca e elimina a la Persona 
     * recorre el hashmap mesa por mesa
     * @param rut de la persona que se eliminara
     */
    public Boolean eliminarPorRut(String rut) { 
        for (Integer key: valparaiso.keySet()){ 
            valparaiso.get(key).eliminarPersonaDeMesa(rut);
            return true;
        } 
        return false;
    }
    /**
     * sobrecarga de metodo
     * true, solo elimina votantes empieza desde la posicion 1: 
     * False, desde vocales elimina vocales posicion 0
     * @param rut rut del que desea eliminar
     * @param a TRUE(solo borra votantes) / FALSE(puede borra vocales y votante);
     */ 
    public void eliminarPorRut(String rut , boolean a){
        for (Integer key: valparaiso.keySet()){
            valparaiso.get(key).eliminarPersonaDeMesa(rut, a);
        }  
    }
    /**
     * Elimina Mesa del HashMap de la clase LugarVotacion
     * @param numeroMesa es la id de la mesa que se quiere eliminar
     */
    public void eliminarMesa(int numeroMesa){
            valparaiso.remove(numeroMesa);
    }
    /**
     * busca la mesa y mandan los votos
     * @param numero numero de mesa a la que se coloca los votos
     * @param si votos si
     * @param no votos no
     * @param nulos votos nulos
     */
    public void rellenarEscrutinio(int numero, int si, int no, int nulos){
        valparaiso.get(numero).rellenaVotos(si, no, nulos);
    }
    /**
     * 
     * @return cantidad total de votos SI
     */
    public int obtenerTotalSi(){
        int total = 0;
        for (Integer key : valparaiso.keySet()){
            total += valparaiso.get(key).obtenerSi();
        }
        return total;
    }
    /**
     * 
     * @return cantidad total de votos NO
     */
    public int obtenerTotalNo(){
        int total = 0;
        for (Integer key : valparaiso.keySet()){
            total += valparaiso.get(key).obtenerNo();
        }
        return total;
    }
    /**
     * 
     * @return cantidad total de votos Nulos
     */
    public int obtenerTotalNulos(){
        int total = 0;
        for (Integer key : valparaiso.keySet()){
            total += valparaiso.get(key).obtenerNulos();
        }
        return total;
    }
      
    /**
     * Funcion cargar datos desde un csv
     * esta funcion con solo tener el archivo Persona.txt carga automaticamente
     * solo llamando la funcion
     * @throws IOException 
     */
    public void cargarInscritos() throws IOException{
        String filePath = "./Personas.txt";
        BufferedReader leer = new BufferedReader(new FileReader(filePath));
        String lineText = null;

        while ((lineText = leer.readLine()) != null) {
            String[] arr = lineText.split(",");
            if (arr.length == 4) {
                Vocal nuevoVocal = new Vocal(arr[1], arr[2], Integer.parseInt(arr[0]), arr[3]);
                agregarPersonaAMesa(nuevoVocal, Integer.parseInt(arr[0]));
            } else if (arr.length == 3) {
                Votante nuevoVotante = new Votante(arr[1], arr[2], Integer.parseInt(arr[0]));
                agregarPersonaAMesa(nuevoVotante, Integer.parseInt(arr[0]));
            }
        }
        leer.close();
    }
}
    