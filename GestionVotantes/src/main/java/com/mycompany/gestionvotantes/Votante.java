/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionvotantes;

/**
 *
 * @author esteb
 */
public class Votante {
    private String name;
    private int rut;
    
    //constructor
    public Votante(String name, int rut){
        this.name = name;
        this.rut = rut;
    }
    
    public void mostrarVotante(){
        System.out.println("Nombre: "+name+"\n");
        System.out.println("RUT: "+rut+"\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }
}
