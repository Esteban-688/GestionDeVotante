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
        LugarVotacion valpo = new LugarVotacion();
        HashMap <Integer,Mesa> auxV = new HashMap<>(); 
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        do{
         
            System.out.println("Elija una opcion:\n");
                System.out.println("------------------------------------\n");
                System.out.println("1. Agregar Votante \n");
                System.out.println("2. Mostrar todos los votantes \n");
                System.out.println("3. Crear Mesa\n");
                System.out.println("4. \n");
                System.out.println("5.  \n");
                System.out.println("6.  \n");
                System.out.println("------------------------------------\n");
                choose = Integer.parseInt(leer.readLine());
                
                switch(choose){
                    case 1:{
                        System.out.println("--AGREGAR VOTANTE--");
                        int id = 0;
                        System.out.println("Introduzca el Número de la Mesa \n");
                        id = Integer.parseInt(leer.readLine());
                        //comparar si existe una mesa ya creada
                        //if (.equals(id)){
                            
                        //}
                        //else{
                        valpo.agregarMesa(id); 
                        //}
                        auxV = valpo.getValparaiso();
                        Mesa mesaVotante = new Mesa(id);
                        mesaVotante=auxV.get(id);
                        mesaVotante.agregarVotante(id);
                        break;
                    }
                    case 2:{
                        System.out.println("--MOSTRAR VOTANTES-- ");
                            valpo.mostrarTodo(auxV);
                        break;
                    }
                    case 3:{
                        System.out.println("--AGREGAR MESA");
                        
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
