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
    private int rut;
    private int nMesa;
    private String name;
    
    public Votante(String name, int rut, int nMesa) {
        this.name = name;
        this.rut = rut;
        this.nMesa = nMesa;
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

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }
    
    public int getNMesa() {
        return nMesa;
    }
    
    public void setNMesa(int nMesa) {
        this.nMesa = nMesa;
    }
}
