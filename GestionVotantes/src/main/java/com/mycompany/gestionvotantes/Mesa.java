
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
    
    
    //constructor
    public Mesa(int numeroDeMesa){
        id = numeroDeMesa;
        reservarParaVocal();
    }
   
    //funciones
    public void reservarParaVocal(){
        String name = ("VOCAL DE MESA");
        String rut = ("NO ASIGNADO");
        //aunque dice que es un votante solo es para reservar el espacio para cuando se asigne un nuevo vocal
        //a una mesa ya creada;
        Votante nuevoVocal = new Votante(name, rut, id);
        mesaPersona.add(0, nuevoVocal);
    }
    
    //retorna true si el vocal existe, si no retorna false; 
    public boolean retonarSiExisteVocal(){
        
       if(mesaPersona.get(0).getName().equals("VOCAL DE MESA")){
           return false;
       }
        return true;
    }
    //obtener un arraylist un votante de una mesa
    public Persona obtenerPersona(int index){
        return mesaPersona.get(index);
    }
    //retona el total de una arraylist
    public int obtenerTotal(){
        return mesaPersona.size();
    }
    
    //agrega un votante a una mesa ya existente,parametros: mesa existente
    public boolean agregarPersonaAMesa(Persona personaNueva) {
        //aca se pregunta si es vocal o votante
        if(personaNueva.retornaTipo() == true){
            //agrego Votante al final del Arraylist
            
            mesaPersona.add(personaNueva);
            return true;
        }
        if(personaNueva.retornaTipo() == false){
            //agrego Vocal
            //Primero elimino el vocal Vacio, porque si solo se agrega todo se corre a la derecha
            mesaPersona.remove(0);
            // se añade la persona tipo vocal
            mesaPersona.add(0,personaNueva);
            return true;
        }
        return false;     
    }
    
    //esta funcion se encargar de imprimir el Arraylist que tiene todos los votante
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
    
    //con rut el imprime un solo votante mediante su rut
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
    //sobrecarga de metodo
    //si entra true elimina votante, si entra false elimina vocal
    public Boolean eliminarPersonaDeMesa(String rut, boolean a) {
        
        //si es true empieza a recorrer desde 1 para no eliminar ningun vocal
        if(a){
            for(int i = 1; i < mesaPersona.size(); i++) {
                if(rut.equals(mesaPersona.get(i).getRut())){
                    mesaPersona.remove(i);
                    return true;
                }
            }
            return false;
        }
        //si es false elimina desde la posicion 0, asi se puede eliminar hasta vocales
        if(a == false){
            eliminarPersonaDeMesa(rut);
            return true;
        }
        return false;
    }
    
    
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
