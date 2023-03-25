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
        int se = 100;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        do{
         
            System.out.println("Elija una opcion:\n");
                System.out.println("------------------------------------\n");
                System.out.println("1.  \n");
                System.out.println("2.  \n");
                System.out.println("3.  \n");
                System.out.println("4.  \n");
                System.out.println("5.  \n");
                System.out.println("6.  \n");
                System.out.println("------------------------------------\n");
                se = leer.read();
                
                switch(se){
                    case 1:{
                        System.out.println("");
                        break;
                    }
                    case 2:{
                        System.out.println("");
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
        }while(se!=0);
    }
    
}
