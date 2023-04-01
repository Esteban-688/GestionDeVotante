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
 * @author estebanRodriguez , eduardomarin , viventemorales
 */
public class Main {
    public static void main (String[]arg) throws IOException{
        
        System.out.println("Bienvenido al programa de gestion de asistencia");
        int choose = 100;
        LugarVotacion valpo = new LugarVotacion();
        HashMap <Integer,Mesa> auxV = new HashMap<>(); 
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        do{
         
            System.out.println("Elija una opcion:\n");
                System.out.println("------------------------------------\n");
                System.out.println("1. Agregar Votante \n");
                System.out.println("2. Mostrar todas las Mesas \n");
                System.out.println("3. Mostrar por Mesa\n");
                System.out.println("4. Buscar por Rut\n");
                System.out.println("5. Eliminar por Rut\n");
                System.out.println("6. Eliminar Mesa\n");
                System.out.println("------------------------------------\n");
                choose = Integer.parseInt(leer.readLine());
                
                switch(choose){
                    case 1:{
                        
                        System.out.println("--AGREGAR VOTANTE--"); 
                        valpo.agregarMesa(valpo);
                        break;
                    }
                    case 2:{
                        System.out.println("--MOSTRAR TODAS LAS MESAS-- ");
                            valpo.mostrarTodo(valpo);
                        break;
                    }
                    case 3:{
                        System.out.println("--MOSTRAR POR MESA");
                            valpo.mostrarMesa(valpo);
                        break;
                    }
                    case 4:{
                        System.out.println("BUSCAR VOTANTE POR RUT");
                            valpo.buscarRut(valpo);
                        break;
                    }
                    case 5:{
                        System.out.println("ELIMINAR VOTANTE POR RUT");
                        break;
                    }
                    case 6:{
                        System.out.println("ELIMINAR MESA POR NUMERO");
                        break;
                    }
                }
        }while(choose!=0);
    }
    
}
