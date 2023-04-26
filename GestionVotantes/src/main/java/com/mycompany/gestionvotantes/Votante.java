/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionvotantes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author esteb
 */

public class Votante {
    private String rut;//su rut
    private int nMesa;//numero de la mesa que se encuentra
    private String name;//nombre del votante
    private  BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    //constructores
    
    public Votante(String nombre, String rutVotante, int numeroMesa) {
        name = nombre;
        rut = rutVotante;
        nMesa = numeroMesa;
    }
    public Votante(){
        name = "";
        rut = "";
        nMesa = 0;
    }
    
    //este metodo rellena desde pantalla un votante ya creado
    public void crearVotante()throws IOException{
        
        //declartion variable
       // String nombre;
        //String rutVotante;
        //Se piden los datos
        
        //
        System.out.println("Introduzca el nombre del votante: " );
        name = leer.readLine();
        System.out.println("Introduzca el RUT sin puntos ni guión: ");
        rut = leer.readLine();
        //aca se verifica 
        nMesa = verificarId();
        System.out.println();
        
        //se rellena con lo solicitado
        //Votante(name, rut, nMesa);
        
    }
    //esto verifica que la id sea un numero entero
    private int verificarId()throws IOException{
        
        int id = 0;//numero de mesa
        boolean esNumeroValido = false;

        // Validar el número ingresado por el usuario
        while (!esNumeroValido) {
            System.out.println("Introduzca Número de mesa: ");
            String entradaId = leer.readLine();

            // Verificar si la entrada es un número entero
            try {
                
                id = Integer.parseInt(entradaId);
                esNumeroValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            }
        }
       return id;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    public int getNMesa() {
        return nMesa;
    }
    
    public void setNMesa(int nMesa) {
        this.nMesa = nMesa;
    }
}
