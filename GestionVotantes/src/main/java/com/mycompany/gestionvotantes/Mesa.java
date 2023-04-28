package com.mycompany.gestionvotantes;

import java.io.*;
import java.util.*;

/**
 *
 * @author esteb
 */

public class Mesa {
    /* Declaración de variables */
    private int id; // Clave de la mesa en el HashMap
    private ArrayList<Votante> mesaVotante = new ArrayList<Votante>(); // ArrayList de votantes
    
    /* Constructor */
    public Mesa(int numeroDeMesa) {
        id = numeroDeMesa;
    }
   
    /* Funciones */
    
    // Método para obtener un votante desde ArrayList
    public Votante obtenerVotante(int index) {
        return mesaVotante.get(index);
    }

    // Método para obtener el total de votantes del ArrayList
    public int obtenerTotal() {
        return mesaVotante.size();
    }

    // Método que grega un votante a una mesa ya existente. Parámetros: mesa existente
    public void agregarVotanteAMesa(Votante votanteNuevo) {
        mesaVotante.add(votanteNuevo);
        
    }
    
    // Imprime el arraylist con todos sus votantes.
    public boolean imprimirMesa() {
        // Se comprueba que no esté vacío
        if(mesaVotante.size() != 0) {
            // Se recorre el ArrayList en búsqueda de los votantes
            for(int i = 0; i < mesaVotante.size(); i++){
                // Se muestran los datos de cada votante
                System.out.println("Nombre: " + mesaVotante.get(i).getName());
                System.out.println("RUT: " + mesaVotante.get(i).getRut());
                System.out.println("Mesa: " + mesaVotante.get(i).getNMesa());
                System.out.println();
            }
            return true; // Todo se mostró con éxito
        }
        return false; // No existen votantes
    }
    
    // Método que imprime los datos de un votante a partir de su rut
    public Boolean imprimirVotante(String rut) {
        // Se recorre el ArrayList en búsqueda del votante
        for(int i = 0; i < mesaVotante.size(); i++) {
            // Se comprueba que coincida el rut
            if(rut.equals(mesaVotante.get(i).getRut())) {
                System.out.println("Nombre: " + mesaVotante.get(i).getName());
                System.out.println("RUT: " + mesaVotante.get(i).getRut());
                System.out.println("Mesa: " + mesaVotante.get(i).getNMesa());
                return true; // Se imprimió todo
            }
        }
        return false; // No existe el votante
    }

    // Método para eliminar un votante a partir de su rut
    public Boolean eliminarVotanteDeMesa(String rut) {
        // Se recorre el ArrayList en búsqueda del votante
        for(int i = 0; i < mesaVotante.size(); i++) {
            // Se comprueba que coincida el rut
            if(rut.equals(mesaVotante.get(i).getRut())){
                // Se muestran los datos del votante a eliminar
                System.out.println("Nombre: " + mesaVotante.get(i).getName());
                System.out.println("RUT: " + mesaVotante.get(i).getRut());
                System.out.println("Mesa: " + mesaVotante.get(i).getNMesa());
                System.out.println("\n¡Se ha eliminado con éxito!\n");
                mesaVotante.remove(i);
                return true; // Se borró correctamente
            }
        }
        return false; // No se pudo borrar
    }
    
    /* Setters y getters */
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    } 
}
