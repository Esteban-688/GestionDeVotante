
package com.mycompany.gestionvotantes;

/**
 *
 * @author esteb
 */
public class Vocal extends Persona{
    //declaration Varible
    private String usuario;
    private String contraseña;
    
    
    //contructor
    public Vocal(String name, String rutVocal, int numeroMesa, String password){
        super(name, rutVocal, numeroMesa);     
        usuario = name;
        contraseña = password;
    }
    
    //metodo abstract de Persona
    @Override
    public boolean retornaTipo(){
        //retorna false asi indica que es un vocal
        return false;
    }
    
    //setters y getters
    
    public void setContraseña(String password){
        contraseña = password;
    }
    
    public String getContraseña(){
        return contraseña;
    }
    
    public String getUsuario(){
        return usuario;
    }
}
