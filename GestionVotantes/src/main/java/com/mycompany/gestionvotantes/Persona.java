
package com.mycompany.gestionvotantes;

/**
 *
 * @author esteb
 */
public abstract class Persona {
    //declaration Variable
    protected String name;
    private String rut;
    private int nMesa;
    
    public Persona(String nombre, String rutPersona, int numeroMesa){
        name = nombre;
        rut = rutPersona;
        nMesa = numeroMesa;
    }
    
    //este metodo retornara votante(true) o vocal(false)
    public abstract boolean retornaTipo();
   
    
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
