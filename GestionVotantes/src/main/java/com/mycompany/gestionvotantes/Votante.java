
package com.mycompany.gestionvotantes;


/**
 *
 * @author esteb
 */

public class Votante {
    private String rut;//su rut
    private int nMesa;//numero de la mesa que se encuentra
    private String name;//nombre del votante
   
    //constructores
    
    public Votante(String nombre, String rutVotante, int numeroMesa) {
        name = nombre;
        rut = rutVotante;
        nMesa = numeroMesa;
    } 
    
    //setters y getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    public int getNMesa() {
        return nMesa;
    }
    
    public void setNMesa(int nMesa) {
        this.nMesa = nMesa;
    }

     //Funcion cargar datos desde un csv
     public static void cargarInscritos(ArrayList<Votante> mesaVotante) throws IOException{
		String filePath = "personasInscritas.txt";
        BufferedReader lectorTxt = new BufferedReader( new FileReader( filePath ) );
		String lineText = null;
		
		while ((lineText = lectorTxt.readLine()) != null) {
			Votante bi = new Votante();
			String[] arr = lineText.split(",");
			bi.setNMesa(Integer.parseInt(arr[0]));
			bi.setName(arr[1]);
			bi.setRut(arr[2]);
			mesaVotante.add(bi);
		}
		
		lectorTxt.close();
	}
	
}
