package com.mycompany.gestionvotantes;

import ventanas.InterfacePrincipal;
import java.io.*;
import java.util.*;

/**
 *
 * @author estebanRodriguez , eduardoMarin , vicenteMorales
 */

public class Main {
	public static void main (String[] arg) {
        LugarVotacion valpo = new LugarVotacion();

	   	// Creación de la ventana y despliegue de la interfaz
       	InterfacePrincipal interfacePrincipal = new InterfacePrincipal(valpo);
        interfacePrincipal.setVisible(true);

        // Operaciones en la ventana
       	Menu menu = new Menu();
        menu.desplegarMenu(valpo);
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
