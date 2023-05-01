
package com.mycompany.gestionvotantes;


/**
 *
 * @author esteb
 */

public class Votante extends Persona {
    
    /**
     * CLASE VOTANTE Subclase de Persona
     *  constructor
     * @param nombre Nombre del votante
     * @param rutVotante rut identificador del votante
     * @param numeroMesa Mesa en la que sera añadido
     */
    public Votante(String nombre, String rutVotante, int numeroMesa) {
       super(nombre, rutVotante, numeroMesa);
        
    } 
    
    //metodo abstract desde Persona
    @Override
    public boolean retornaTipo(){
      //con este metodo retornando true, avisa que es un Votante
      return true;
    }
    @Override
    public String contraseña(){
        return null;
    }
}
