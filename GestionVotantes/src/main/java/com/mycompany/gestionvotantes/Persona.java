
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
   
    /**
     * clase Persona es abstracta
     * Constructor de Persona para Heredar a sus SubClases
     * @param nombre    nombre de la persona
     * @param rutPersona    rut de la persona(identificador)
     * @param numeroMesa    numero de mesa en la que van su SubClases
     */
    public Persona(String nombre, String rutPersona, int numeroMesa){
        name = nombre;
        rut = rutPersona;
        nMesa = numeroMesa;
    }
    
    
    /**
     * Metodo ABSTRACTO retornara votante(TRUE) o vocal(FALSE) 
     */
    public abstract boolean retornaTipo();
   
    public abstract String contraseña();
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
