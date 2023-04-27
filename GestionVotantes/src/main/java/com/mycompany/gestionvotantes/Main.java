/*
*18. Gestión de Votantes-Locales de Sufragio para elecciones: Manejo de registro de votantes y
*locales de votación. Hacer auto asignación dependiendo de capacidad de locales de votación
*y ubicación geográfica de las personas en relación al local.
 */
package com.mycompany.gestionvotantes;

import ventanas.InterfacePrincipal;
import java.io.*;
import java.util.*;

/**
 *
 * @author estebanRodriguez , eduardoMarin , vicenteMorales
 */

public class Main {
    public static void main (String[]arg) {
        
       //ventana creacion
       InterfacePrincipal interfacePrincipal = new InterfacePrincipal();
      
        interfacePrincipal.setVisible(true);
        //operaciones ventana
        
       Menu menu = new Menu();
        menu.desplegarMenu();
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
