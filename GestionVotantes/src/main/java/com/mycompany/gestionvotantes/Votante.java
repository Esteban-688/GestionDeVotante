
package com.mycompany.gestionvotantes;


/**
 *
 * @author esteb
 */

public class Votante {
    /* Declaración de variables */
    private String rut; // RUT del votante
    private int nMesa;// Número de la mesa en que se encuentra
    private String name;// Nombre del votante
   
    /* Constructor */
    public Votante(String nombre, String rutVotante, int numeroMesa) {
        name = nombre;
        rut = rutVotante;
        nMesa = numeroMesa;
    } 
    
    /* Setters y getters */
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
