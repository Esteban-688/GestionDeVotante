
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
    private ArrayList<Votante> mesaVotante = new ArrayList<Votante>();
    
    
    //constructor
    public Mesa(int numeroDeMesa){
        id = numeroDeMesa;
    }
   
    //funciones
    
    //obtener un arraylist un votante de una mesa
    public Votante obtenerVotante(int index){
        return mesaVotante.get(index);
    }
    public int obtenerTotal(){
        return mesaVotante.size();
    }
    //agrega un votante a una mesa ya existente,parametros: mesa existente
    public void agregarVotanteAMesa(Votante votanteNuevo) {
        mesaVotante.add(votanteNuevo);
        
    }
    
    //esta funcion se encargar de imprimir el Arraylist que tiene todos los votante
    public boolean imprimirMesa() {
        if(mesaVotante.size() != 0){
            //Se muestran los votantes de cada mesa
        for(int i = 0; i < mesaVotante.size(); i++){
            System.out.println("Nombre: " + mesaVotante.get(i).getName());
            System.out.println("RUT: " + mesaVotante.get(i).getRut());
            System.out.println("Mesa: " + mesaVotante.get(i).getNMesa());
            System.out.println();
        }
        return true;
        }
        return false;
    }
    
    //con rut el imprime un solo votante mediante su rut
    public Boolean imprimirVotante(String rut) {
          
        //Se muestran los datos del votante buscado
        for(int i = 0; i < mesaVotante.size(); i++){
            if(rut.equals(mesaVotante.get(i).getRut()))  {
                System.out.println("Nombre: " + mesaVotante.get(i).getName());
                System.out.println("RUT: " + mesaVotante.get(i).getRut());
                System.out.println("Mesa: " + mesaVotante.get(i).getNMesa());
                return true;
            }
        }
        return false;
    }
    //retorna true si logra borrarlo, sino return false
    public Boolean eliminarVotanteDeMesa(String rut) {
        //Se muestran los datos del votante a eliminar
        for(int i = 0; i < mesaVotante.size(); i++) {
            if(rut.equals(mesaVotante.get(i).getRut())){
                System.out.println("Nombre: " + mesaVotante.get(i).getName());
                System.out.println("RUT: " + mesaVotante.get(i).getRut());
                System.out.println("Mesa: " + mesaVotante.get(i).getNMesa());
                System.out.println("\n¡Se ha eliminado con éxito!\n");
                mesaVotante.remove(i);
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
