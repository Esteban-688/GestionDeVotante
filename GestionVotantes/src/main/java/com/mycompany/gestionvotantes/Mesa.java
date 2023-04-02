
package com.mycompany.gestionvotantes;

import java.io.*;
import java.util.*;

/**
 *
 * @author esteb
 */
public class Mesa {
    
    private int id;
    
    public Mesa(int id){
        this.id = id;
    }
    
    private ArrayList<Votante> mesaVotante = new ArrayList<Votante>();
    
    public void agregarVotante(int rut, String name, int nMesa){
        Votante nuevoV = new Votante(name, rut, nMesa);
        mesaVotante.add(nuevoV);
    }
    
    public void agregarVotante(int id) throws IOException{
    BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
    int rut = 0;
    int nMesa = id;
    String name;
    
        System.out.println("Selecione el Nombre del votante \n" );
        name = leer.readLine();
        System.out.println("Introduzca el Rut sin puntos ni Guion \n");
        rut = Integer.parseInt(leer.readLine());
        
        Votante nuevoV = new Votante(name, rut, nMesa);
        mesaVotante.add(nuevoV);
    }
    
    public void imprimirMesa(ArrayList<Votante> mesaVotante){
        for(int i = 0; i<mesaVotante.size() ;i++){
            System.out.println("Nombre: "+mesaVotante.get(i).getName());
            System.out.println("Rut: "+mesaVotante.get(i).getRut());
            System.out.println("Mesa: "+mesaVotante.get(i).getNMesa());
            System.out.println(" ");
        }
    }
    public void imprimirVotante(ArrayList<Votante> mesaVotante, int rut){
       for(int i = 0; i<mesaVotante.size() ;i++){
           
           if(rut == mesaVotante.get(i).getRut()){
            System.out.println("Nombre: "+mesaVotante.get(i).getName());
            System.out.println("Rut: "+mesaVotante.get(i).getRut());
            System.out.println("Mesa: "+mesaVotante.get(i).getNMesa());
            System.out.println(" ");
           }
        }    
               
    }
    public void eliminarVotante(ArrayList<Votante> mesaVotante, int rut){
        for(int i = 0; i<mesaVotante.size() ;i++){
           
           if(rut == mesaVotante.get(i).getRut()){
            System.out.println("Nombre: "+mesaVotante.get(i).getName());
            System.out.println("Rut: "+mesaVotante.get(i).getRut());
            System.out.println("Mesa: "+mesaVotante.get(i).getNMesa());
            System.out.println(" Se ha eliminado \n");
            mesaVotante.remove(i);
           }
        }
    
    }
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    } 
    
    public ArrayList<Votante> getMesaVotante(){
        return mesaVotante;
    }
    
    public void setMesaVotante(ArrayList<Votante> mesaVotante){
        this.mesaVotante = mesaVotante;
    }
}
