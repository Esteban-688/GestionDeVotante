/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionvotantes;

import java.io.*;
import java.util.*;

/**
 *
 * @author esteb
 */
public class LugarVotacion {
     private HashMap<Integer,Votante> mesaVotacion = new HashMap<>();
    
    public void agregarVotante(Integer rut, String name){
        Votante nuevo = new Votante(name, (int)rut);
        mesaVotacion.put(rut, nuevo);
    }
    
    public void agregarVotante() throws IOException{
    BufferedReader leer = new BufferedReader (new InputStreamReader (System.in));
    int rut = 0;
    String name = new String();
    
        System.out.println("Selecione el Nombre del votante \n" );
        name = leer.readLine();
        System.out.println("Introduzca el Rut sin puntos ni Guion \n");
        rut = Integer.parseInt(leer.readLine());
        
        Votante nuevo = new Votante(name, rut);
        mesaVotacion.put(rut, nuevo);
        
    }
    public HashMap<Integer, Votante> getMesaVotacion() {
        return mesaVotacion;
    }

    public void setMesaVotacion(HashMap<Integer, Votante> mesaVotacion) {
        this.mesaVotacion = mesaVotacion;
    }
    
}
    