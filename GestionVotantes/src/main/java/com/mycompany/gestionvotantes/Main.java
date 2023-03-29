/*
*18. Gestión de Votantes-Locales de Sufragio para elecciones: Manejo de registro de votantes y
*locales de votación. Hacer auto asignación dependiendo de capacidad de locales de votación
*y ubicación geográfica de las personas en relación al local.
 */
package com.mycompany.gestionvotantes;

import java.io.*;
import java.util.*;



/**
 *
 * @author estebanRodriguez
 */
public class Main {
    public static void main (String[]arg) throws IOException{
        
        System.out.println("Bienvenido al programa de gestion de asistencia");
        int choose = 100;
        LugarVotacion mesa = new LugarVotacion();
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        do{
         
            System.out.println("Elija una opcion:\n");
                System.out.println("------------------------------------\n");
                System.out.println("1. Agregar votante \n");
                System.out.println("2. Mostrar todos los votantes \n");
                System.out.println("3. \n");
                System.out.println("4. \n");
                System.out.println("5.  \n");
                System.out.println("6.  \n");
                System.out.println("------------------------------------\n");
                choose = Integer.parseInt(leer.readLine());
                
                switch(choose){
                    case 1:{
                        System.out.println("--AGREGAR VOTANTE--");
                        mesa.agregarMesa();
                        break;
                    }
                    case 2:{
                        System.out.println("--MOSTRAR VOTANTES-- ");
                        HashMap auxMesa = mesa.getValparaiso();
                        for(Object aux: auxMesa.values()){
                            Votante actual = (Votante) aux;
                            System.out.println("Nombre: "+actual.getName()+" \n Rut: "+actual.getRut()+"\n");
                            
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("");
                        break;
                    }
                    case 4:{
                        System.out.println("");
                        break;
                    }
                    case 5:{
                        System.out.println("");
                        break;
                    }
                    case 6:{
                        System.out.println("");
                        break;
                    }
                }
        }while(choose!=0);
    }
    
}
