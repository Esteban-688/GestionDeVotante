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
    private String rut;
    private int nMesa;
    private String name;
    private  BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    //constructor
    public Votante(String name, String rut, int nMesa) {
        this.name = name;
        this.rut = rut;
        this.nMesa = nMesa;
    }
    //sobrecarga de constructor
    public Votante()throws IOException{   
        //declartion variable
        String nombre;
        String rutVotante;
        //Se piden los datos
        
        //
        System.out.println("Introduzca el nombre del votante: " );
        nombre = leer.readLine();
        System.out.println("Introduzca el RUT sin puntos ni guión: ");
        rutVotante = leer.readLine();
        verificarId();
        System.out.println();
        //se rellena con lo solicitado
        name = nombre;
        rut = rutVotante;
       
        
    }
    
    public void verificarId()throws IOException{
        
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
       nMesa = id;
    }
    
    public void mostrarVotante() {
        System.out.println("Nombre: " + name + "\n");
        System.out.println("RUT: " + rut + "\n");
        System.out.println("Mesa" + nMesa + "\n");
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
