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
        
        //agregar automatico los siguientes votantes
        String name1,name2,name3,name4,name5;
        int rut1,rut2,rut3,rut4,rut5,id1=1,id2=2,id3=3;
        //votante1
        name1 = ("Esteban");
        rut1 = 207958360;
        valpo.agregarMesa(valpo,id1,name1,rut1);
        //votante2
        name2 = ("Jorge");
        rut2 = 180634533;
        valpo.agregarMesa(valpo,id1,name2,rut2);
        //votante3
        name3 = ("Julian");
        rut3 = 218553478;
        valpo.agregarMesa(valpo,id2,name3,rut3);
        //votante4
        name4 = ("Diego");
        rut4 = 206674580;
        valpo.agregarMesa(valpo,id2,name4,rut4);
        //votante5
        name5 = ("pedro");
        rut5 = 150580242;
        valpo.agregarMesa(valpo,id3,name5,rut5);
        
        //termino de agregar automatico

        
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
                           valpo.eliminarRut(valpo);
                        break;
                    }
                    case 6:{
                        System.out.println("ELIMINAR MESA POR NUMERO");
                            valpo.eliminarMesa(valpo);
                        break;
                    }
                }
        }while(choose!=0);
    }

    //Funcion cargar datos desde un csv
    /*public static void cargarInscritos(ArrayList<Votante> mesaVotante) throws IOException{
		String filePath = "personasInscritas.txt";
		
		
		BufferedReader lectorTxt = new BufferedReader( new FileReader( filePath ) );
		String lineText = null;
		
		while ((lineText = lectorTxt.readLine()) != null) {
			Votante bi = new Votante();
			String[] arr = lineText.split(",");
			bi.setName(arr[0]);
			bi.setRut(Integer.parseInt(arr[2]));
			bi.setNMesa(Integer.parseInt(arr[3]));
			mesaVotante.add(bi);
		}
		
		lectorTxt.close();
	}*/
	




    
}
