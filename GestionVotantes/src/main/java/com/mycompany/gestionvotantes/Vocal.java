
package com.mycompany.gestionvotantes;

/**
 *
 * @author esteb
 */
public class Vocal extends Persona{
    //declaration Varible
    private String usuario;
    private String contraseña;
    
    
    /**
     * CLASE VOCAL Subclase de Persona 
     * constructor
     * @param name Nombre del vocal
     * @param rutVocal rut identificador del vocal
     * @param numeroMesa Mesa en la que sera vocal
     * @param password contraseña que sera usada para inicios de sesion
     */
    public Vocal(String name, String rutVocal, int numeroMesa, String password){
        super(name, rutVocal, numeroMesa);     
        usuario = rutVocal;
        contraseña = password;
    }
    
    @Override
    public boolean retornaTipo(){
        //retorna false asi indica que es un vocal
        return false;
    }
    
    //setters y getters
   
    @Override
    public String getName(){
        return ("VOCAL "+ name);
    }
    
    @Override
    public String contraseña(){
        return contraseña;
    }
    
    public String getUsuario(){
        return usuario;
    }
}
