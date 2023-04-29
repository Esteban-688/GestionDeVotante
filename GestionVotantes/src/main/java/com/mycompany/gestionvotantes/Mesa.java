
package com.mycompany.gestionvotantes;

import java.io.*;
import java.util.*;

/**
 *
 * @author esteb
 */

public class Mesa {
    //declaration Variable
    private int id;//numero de la mesa que corresponde la cual es la id del hashmap en donde se encuentra
    private ArrayList<Persona> mesaPersona = new ArrayList<>();
    
    
    /**
     * Constructor de MESA
     * se crea una mesa que dentro tiene un Arraylist
     * y se crea un vocal vacio
     * @param numeroDeMesa es la id que tendra para identificar que mesa
     */
    public Mesa(int numeroDeMesa){
        id = numeroDeMesa;
        reservarParaVocal();
    }
   
    /**
     * se utiliza para que ninguna mesa se cree si un vocal
     * crea un votante(se crea como votante para uno utilizar usuario y contraseña)
     * se agrega el votante vacio y lo coloca en la posicion 0 del ArrayList
     * name: VOCAL DE MESA
      *rut: NO ASIGNADO
     */
    public void reservarParaVocal(){
        String name = ("VOCAL DE MESA");
        String rut = ("NO ASIGNADO");
        //aunque dice que es un votante solo es para reservar el espacio para cuando se asigne un nuevo vocal
        //a una mesa ya creada;
        Votante nuevoVocal = new Votante(name, rut, id);
        mesaPersona.add(0, nuevoVocal);
    }
    
    /**
     * esta funcion pregunta en la mesa si existe un vocal
     * si en la posicion 0 hay un "vocal vacio" retorna false
     * @return TRUE si el vocal existe, FALSE si no existe vocal
     */
    public boolean retonarSiExisteVocal(){
        
       if(mesaPersona.get(0).getName().equals("VOCAL DE MESA")){
           return false;
       }
        return true;
    }
    /**
     * esta funncion retorna la persona del arraylist(index)
     * @param index posicion de la que retorna el ArrayList
     * @return un tipo Persona
     */
    public Persona obtenerPersona(int index){
        return mesaPersona.get(index);
    }
    /**
     * esta funcion se utiliza para saber la cantidad Personas que tiene la mesa
     * @return la cantidad total del Arraylist
     */
    public int obtenerTotal(){
        return mesaPersona.size();
    }
    /**
     * Esta funcion agrega una persona a la mesa 
     * / si es vocal agrega al principio y sobrescribime
     * / si es votante agrega desde la posicion 1
     * @param personaNueva vocal/votante que se quiera agregar
     * @return TRUE si agrego a la persona, False si no logra agregar
     */
    public boolean agregarPersonaAMesa(Persona personaNueva) {
        
        if(personaNueva.retornaTipo() == true){
            //agrego Votante al final del Arraylist
            mesaPersona.add(personaNueva);
            return true;
        }
        if(personaNueva.retornaTipo() == false){
            //agrega Vocal
            mesaPersona.remove(0);
            // se añade la persona tipo vocal
            mesaPersona.add(0,personaNueva);
            return true;
        }
        return false;     
    }
    /**
     * funcion se encargar de imprimir el Arraylist que tiene todos los votante
     */
    public void imprimirMesa() {
        if(mesaPersona.size() != 0){
            //Se muestran los votantes de cada mesa
            for(int i = 0; i < mesaPersona.size(); i++){
                if(mesaPersona.get(i).retornaTipo()){
                System.out.println("Nombre: " + mesaPersona.get(i).getName());
                System.out.println("RUT: " + mesaPersona.get(i).getRut());
                System.out.println("Mesa: " + mesaPersona.get(i).getNMesa());
                System.out.println();
                }
                 if(mesaPersona.get(i).retornaTipo() == false){
                System.out.println("nombre: " + mesaPersona.get(i).getName());
                System.out.println("RUT: " + mesaPersona.get(i).getRut());
                System.out.println("Mesa: " + mesaPersona.get(i).getNMesa());
                System.out.println();
                }
            }
        }
    }
    /**
     * SI escoges FALSE Retorna VOTANTE/VOCAL y lo IMPRIME
     * SI escoges True solo retorna un VOTANTE/VOCAL
     * @param rut rut de persona
     * @param a TRUE(SOLO RETORNA VOTANTE) FALSE(RETORNA E IMPRIME por consola)
     * @return TIPO PERSONA/ TRUE(retorna solo PERSONA) / FALSE(retorna y imprime por consola)
     */
    public Persona imprimirPersona(String rut, boolean a) {
          
        //Se muestran los datos del votante buscado
        for(int i = 0; i < mesaPersona.size(); i++){
            if(rut.equals(mesaPersona.get(i).getRut()))  {
                if(a == false){
                System.out.println("Nombre: " +mesaPersona.get(i).getName());
                System.out.println("RUT: " + mesaPersona.get(i).getRut());
                System.out.println("Mesa: " + mesaPersona.get(i).getNMesa());
                }
                return mesaPersona.get(i);
            }
        }
        return null;
    }
   
    //retorna true si logra borrarlo, sino return false
    /**
     * Elimina la persona segun su rut
     * @param rut identificador de persona
     * @return TRUE si logra borrarlo FALSE si NO puede borrarlo 
     */
    public Boolean eliminarPersonaDeMesa(String rut) {
        //Se muestran los datos de la persona a eliminar
        for(int i = 0; i < mesaPersona.size(); i++) {
            if(rut.equals(mesaPersona.get(i).getRut())){
                System.out.println("Nombre: " + mesaPersona.get(i).getName());
                System.out.println("RUT: " + mesaPersona.get(i).getRut());
                System.out.println("Mesa: " + mesaPersona.get(i).getNMesa());
                System.out.println("\n¡Se ha eliminado con éxito!\n");
                mesaPersona.remove(i);
                return true;
            }
        }
        return false;
    }
    
    /**
     * sobrecarga de metodo
     * Elimina la persona segun su rut
     * si es true empieza a buscar el rut desde index 1
     * si es false empieza desde 0 y puede borrar vocal
     * @param rut identificador de persona
     * @param a TRUE ELIMINA VOTANTE, FALSE ELIMINA DESDE VOCALES
     * @return TRUE si logra borrarlo FALSE si NO puede borrarlo 
     */
    public Boolean eliminarPersonaDeMesa(String rut, boolean a) {
        
        //TRUE
        if(a){
            for(int i = 1; i < mesaPersona.size(); i++) {
                if(rut.equals(mesaPersona.get(i).getRut())){
                    mesaPersona.remove(i);
                    return true;
                }
            }
            return false;
        }
        //FALSE
        if(a == false){
            eliminarPersonaDeMesa(rut);
            return true;
        }
        return false;
    }
    
    /**
     * esta funcion toma un votante y lo transforma vocal
     * tambien lo cambia de posicion con el vocal y elimina el antiguo vocal
     * y tambien se elimina la posicion antes de ser vocal
     * @param rut del votante
     * @param contraseña para agregarlo al vocal
     * @return TRUE si lo cambia con exito FALSE si no puede cambiarlo
     */
    public boolean transformarVotanteAVocal(String rut, String contraseña){
        for(int i = 1; i < mesaPersona.size(); i++){
            if(rut.equals(mesaPersona.get(i).getRut()))  {
               Vocal nuevoVocal = new Vocal(mesaPersona.get(i).getName(), mesaPersona.get(i).getRut(), mesaPersona.get(i).getNMesa(), contraseña);
                agregarPersonaAMesa(nuevoVocal);
                System.out.println("se ha cambiado el nuevo Vocal");
               return true;
            }
        }
        return false;
    }
    
    //setter y getters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    } 
}
