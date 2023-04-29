
package com.mycompany.MisExceptiones;

/**
 *
 * @author esteb
 */
public class ExceptionMesaNoCreada extends Exception{
 //esta excepcion se lanzara cuando se trate de meter un votante a una mesa no creada
    //String a =("Mesa no existe");
    public ExceptionMesaNoCreada(){
        super("Mesa no existe");
    }
   }
