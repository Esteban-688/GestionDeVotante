
package com.mycompany.gestionvotantes;

import java.io.*;
import java.util.*;

/**
 *
 * @author esteb
 */

public class Mesa {
    //declaration Variable
    private int id;
    private ArrayList<Votante> mesaVotante = new ArrayList<Votante>();
    private BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    
    //constructor
    public Mesa(int id){
        this.id = id;
    }
    //sobrecargar de constructor
    public Mesa()throws IOException{
        Votante nuevoVotante = new Votante();
        mesaVotante.add(nuevoVotante);
        id = nuevoVotante.getNMesa();
    }
    
    //funciones
    
    //obtener un arraylist desde una mesa
    public ArrayList<Votante> obtenerLista() {
        return mesaVotante;
    }
    
    //agrega un votante a una mesa ya existente,parametros: mesa existente
    public void agregarVotanteAMesa(ArrayList<Votante> mesaExistente) {
           
        mesaVotante = obtenerLista();
        mesaVotante.add(mesaExistente.get(0));
        
    }
    
    public ArrayList<Votante> agregarVotanteAMesa()throws IOException{
        //declaration variables de Instacia
        
        Votante nuevoVotante = new Votante();
        mesaVotante.add(nuevoVotante);
        id = nuevoVotante.getNMesa();
        return mesaVotante;
        
    }
    
    public void imprimirMesa(ArrayList<Votante> mesaVotante) {
        //Se muestran los votantes de cada mesa
        for(int i = 0; i < mesaVotante.size(); i++){
            System.out.println("Nombre: " + mesaVotante.get(i).getName());
            System.out.println("RUT: " + mesaVotante.get(i).getRut());
            System.out.println("Mesa: " + mesaVotante.get(i).getNMesa());
            System.out.println();
        }
    }
    /*
    public void imprimirVotante(ArrayList<Votante> mesaVotante, int rut) {
        //Se muestran los datos del votante buscado
        for(int i = 0; i < mesaVotante.size(); i++){
            if(rut == mesaVotante.get(i).getRut()) {
                System.out.println("Nombre: " + mesaVotante.get(i).getName());
                System.out.println("RUT: " + mesaVotante.get(i).getRut());
                System.out.println("Mesa: " + mesaVotante.get(i).getNMesa());
            }
        }
    }

    public void eliminarVotante(ArrayList<Votante> mesaVotante, int rut) {
        //Se muestran los datos del votante a eliminar
        for(int i = 0; i < mesaVotante.size(); i++) {
            if(rut == mesaVotante.get(i).getRut()) {
                System.out.println("Nombre: " + mesaVotante.get(i).getName());
                System.out.println("RUT: " + mesaVotante.get(i).getRut());
                System.out.println("Mesa: " + mesaVotante.get(i).getNMesa());
                System.out.println("\n¡Se ha eliminado con éxito!\n");
                mesaVotante.remove(i);
            }
        }
    }
*/
    
    
    //setter y getters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    } 
}
