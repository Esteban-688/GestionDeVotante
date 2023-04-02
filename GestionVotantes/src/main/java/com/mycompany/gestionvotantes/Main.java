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
 * @author estebanRodriguez , eduardoMarin , vicenteMorales
 */

public class Main {
    public static void main (String[]arg) throws IOException {
        int choose = 100;
        LugarVotacion valpo = new LugarVotacion();
        HashMap <Integer, Mesa> auxV = new HashMap<>(); 
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        //Agregar por defecto los siguientes votantes:
        String name1, name2, name3, name4, name5;
        int rut1, rut2, rut3, rut4, rut5, id1 = 1, id2 = 2, id3 = 3;

        //Votante N°1
        name1 = ("Esteban");
        rut1 = 207958360;
        valpo.agregarMesa(valpo, id1, name1, rut1);

        //Votante N°2
        name2 = ("Jorge");
        rut2 = 180634533;
        valpo.agregarMesa(valpo, id1, name2, rut2);

        //Votante N°3
        name3 = ("Julian");
        rut3 = 218553478;
        valpo.agregarMesa(valpo, id2, name3, rut3);

        //Votante N°4
        name4 = ("Diego");
        rut4 = 206674580;
        valpo.agregarMesa(valpo, id2, name4, rut4);

        //Votante N°5
        name5 = ("pedro");
        rut5 = 150580242;
        valpo.agregarMesa(valpo, id3, name5, rut5);
        //Término de agregar por defecto

        //Menú de opciones
        System.out.println("Bienvenido al programa de gestión de asistencia\n");
        do {
            System.out.println("Menú de opciones");
            System.out.println("------------------------------------");
            System.out.println("(1) Agregar votante");
            System.out.println("(2) Mostrar todas las mesas");
            System.out.println("(3) Mostrar por mesa");
            System.out.println("(4) Buscar por RUT");
            System.out.println("(5) Eliminar por RUT");
            System.out.println("(6) Eliminar mesa");
            System.out.println("------------------------------------\n");
            System.out.print("Elija una opción: ");
            choose = Integer.parseInt(leer.readLine());
            System.out.println();
            
            //Selección de opciones
            switch(choose) {
                case 1: {
                    System.out.println("-- AGREGAR VOTANTE --"); 
                    valpo.agregarMesa(valpo);
                    break;
                }

                case 2: {
                    System.out.println("-- MOSTRAR TODAS LAS MESAS --");
                    valpo.mostrarTodo(valpo);
                    break;
                }

                case 3: {
                    System.out.println("-- MOSTRAR POR MESA --");
                    valpo.mostrarMesa(valpo);
                    break;
                }

                case 4: {
                    System.out.println("-- BUSCAR VOTANTE POR RUT --");
                    valpo.buscarRut(valpo);
                    break;
                }

                case 5: {
                    System.out.println("-- ELIMINAR VOTANTE POR RUT --");
                    valpo.eliminarRut(valpo);
                    break;
                }

                case 6: {
                    System.out.println("-- ELIMINAR MESA POR NUMERO --");
                    valpo.eliminarMesa(valpo);
                    break;
                }

                default: {
                    break;
                }
            }
        } while(choose != 0);
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
