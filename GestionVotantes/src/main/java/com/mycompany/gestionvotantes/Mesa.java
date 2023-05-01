
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
    private ArrayList<Persona> mesaPersona = new ArrayList<>();//guarda objetos Persona
    /**
     * guarda los votos escultados
     * posicion 0 = SI / 1 = NO / 3 = NULOS
     */
    private ArrayList<Integer> escrutinio = new ArrayList<>();
    
    
    /**
     * Constructor de MESA
     * se crea una mesa que dentro tiene un Arraylist
     * y se crea un vocal vacio
     * @param numeroDeMesa es la id que tendra para identificar que mesa
     */
    public Mesa(int numeroDeMesa){
        id = numeroDeMesa;
        reservarParaVocal();
        escrutinio.add(0,0);//SI
        escrutinio.add(1,0);//NO
        escrutinio.add(2,0);//NULOS
    }
   
    /**
     * se utiliza para que ninguna mesa se cree si un vocal
     * crea un votante(se crea como votante para uno utilizar usuario y contraseña)
     * se agrega el votante vacio y lo coloca en la posicion 0 del ArrayList
     * name: VOCAL DE MESA
      *rut: NO ASIGNADO
     */
    public void reservarParaVocal(){
        String name = ("DE MESA");
        String rut = ("NO ASIGNADO");
        
        Vocal nuevoVocal = new Vocal(name, rut, id," ");
        mesaPersona.add(0, nuevoVocal);
    }
    
    /**
     * esta funcion pregunta en la mesa si existe un vocal
     * si en la posicion 0 hay un "vocal vacio" retorna true
     * @return TRUE si el vocal no existe, FALSE si existe vocal
     */
    public boolean retonarSiExisteVocal(){
        
       if(mesaPersona.get(0).getName().equals("VOCAL DE MESA")){
           return true;
       }
        return false;
    }
    /**
     * esta funcion retorna la persona del arraylist mesaVotantes(index)
     * @param index posicion de la que retorna el ArrayList
     * @return un tipo Persona
     */
    public Persona obtenerPersona(int index){
        return mesaPersona.get(index);
    }
    /**
     * esta funcion retorna el valor de los votos del arraylist escrutinio(index)
     * @param index posicion de la que retorna el ArrayList
     * @return un entero valor del voto SI/NO/NULOS
     */
    public int obtenerVotos(int index){
        return escrutinio.get(index);
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
    /**
     * SI escoges FALSE Retorna VOTANTES
     * SI escoges True  Retorna un VOTANTE/VOCAL
     * @param rut rut de persona
     * @param a TRUE(SOLO RETORNA VOTANTE) FALSE(RETORNA E IMPRIME por consola)
     * @return TIPO PERSONA/ TRUE(retorna solo PERSONA) / FALSE(retorna SOLO VOTANTES)
     */
    public Persona retornarPersona(String rut, boolean a) {
          
        //Se muestran los datos del votante buscado
        if(a){
            for(int i = 0; i < mesaPersona.size(); i++){
                if(rut.equals(mesaPersona.get(i).getRut()))  {
                    return mesaPersona.get(i);
                }
            }
        }
        if(a == false){
            for(int i = 1; i < mesaPersona.size(); i++){
                if(rut.equals(mesaPersona.get(i).getRut()))  {
                    return mesaPersona.get(i);
                }
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
    /**
     * reescribe los votos de la mesa escrutinio
     * @param si votos SI
     * @param no Votos NO
     * @param nulos votos NULOS
     * @return TRUE de que lo hizo correctamente
     */
    public boolean rellenaVotos(int si, int no, int nulos){
        escrutinio.add(0,si);//SI
        escrutinio.add(1,no);//NO
        escrutinio.add(2,nulos);//NULOS
        return true;
    }
    /**
     * 
     * @return cantidad de votos SI
     */
    public int obtenerSi(){   
        return escrutinio.get(0);
    }
    /**
     * 
     * @return cantidad de votos NO
     */
    public int obtenerNo(){  
         return escrutinio.get(1);
    }
    /**
     * 
     * @return cantidad de votos Nulos
     */
    public int obtenerNulos(){
         return escrutinio.get(2);
    }
    
    
    //setter y getters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    } 
}
