
package com.mycompany.gestionvotantes;


/**
 *
 * @author esteb
 */

public class Votante {
    private String rut;//su rut
    private int nMesa;//numero de la mesa que se encuentra
    private String name;//nombre del votante
   
    //constructores
    
    public Votante(String nombre, String rutVotante, int numeroMesa) {
        name = nombre;
        rut = rutVotante;
        nMesa = numeroMesa;
    } 
    
    //setters y getters
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
