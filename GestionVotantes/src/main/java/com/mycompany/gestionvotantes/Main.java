/*
*18. Gestión de Votantes-Locales de Sufragio para elecciones: Manejo de registro de votantes y
*locales de votación. Hacer auto asignación dependiendo de capacidad de locales de votación
*y ubicación geográfica de las personas en relación al local.
 */
package com.mycompany.gestionvotantes;

import ventanas.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author estebanRodriguez , eduardoMarin , vicenteMorales
 */
public class Main {
    /**
     * main donde se inicia todas la funciones por consola 
     * /se inicializa la ventana Principal 
     * /se inicializa la ventana Login 
     * /desplega menu de consola  
     */
    public static void main (String[]arg) {
        LugarVotacion valpo = new LugarVotacion();
        
        try{
            valpo.cargarInscritos();
        }catch(IOException e){
            System.out.println("ERROR AL CARGAR ARCHIVO");
        }
       //ventana creacion
        InterfacePrincipal interfacePrincipal = new InterfacePrincipal(valpo);
        
        Login login = new Login(valpo,interfacePrincipal);
        
        login.setVisible(true);
        
        //operaciones por consola
        //desactivados para solo uso de ventanas
       //Menu menu = new Menu();
       //menu.desplegarMenu(valpo);
    }
}
