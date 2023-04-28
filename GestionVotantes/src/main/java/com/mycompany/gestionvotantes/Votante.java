
package com.mycompany.gestionvotantes;


/**
 *
 * @author esteb
 */

public class Votante extends Persona {
   
    //constructores
    
    public Votante(String nombre, String rutVotante, int numeroMesa) {
       super(nombre, rutVotante, numeroMesa);
        
    } 
    
    //metodo abstract desde Persona
    @Override
    public boolean retornaTipo(){
      //con este metodo retornando true, avisa que es un Votante
      return true;
    }
    
}
