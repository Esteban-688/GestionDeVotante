
package com.mycompany.gestionvotantes;

import java.io.*;
import java.util.*;

/**
 *
 * @author esteb
 */

public class Mesa {
    private int id;
    private ArrayList<Votante> mesaVotante = new ArrayList<Votante>();
    
    public Mesa(int id){
        this.id = id;
    }
    
    public void agregarVotante(int rut, String name, int nMesa) {
        Votante nuevoV = new Votante(name, rut, nMesa);
        mesaVotante.add(nuevoV);
    }
    
    public void agregarVotante(int id) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int rut = 0;
        int nMesa = id;
        String name;
    
        //Se piden los datos
        System.out.print("Introduzca el nombre del votante: " );
        name = leer.readLine();
        System.out.print("Introduzca el RUT sin puntos ni guión: ");
        rut = Integer.parseInt(leer.readLine());
        System.out.println();
        
        Votante nuevoV = new Votante(name, rut, nMesa);
        mesaVotante.add(nuevoV);
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

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    } 
    
    public ArrayList<Votante> getMesaVotante() {
        return mesaVotante;
    }
    
    public void setMesaVotante(ArrayList<Votante> mesaVotante) {
        this.mesaVotante = mesaVotante;
    }
}
