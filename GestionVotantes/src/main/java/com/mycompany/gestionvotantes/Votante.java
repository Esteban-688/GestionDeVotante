
package com.mycompany.gestionvotantes;


/**
 *
 * @author esteb
 */

public class Votante extends Persona {
    
    /**
     * CLASE VOTANTE Subclase de Persona
     *  constructor
     * @param nombre Nombre del votante
     * @param rutVotante rut identificador del votante
     * @param numeroMesa Mesa en la que sera añadido
     */
    public Votante(String nombre, String rutVotante, int numeroMesa) {
       super(nombre, rutVotante, numeroMesa);
        
    } 
    
    //metodo abstract desde Persona
    @Override
    public boolean retornaTipo(){
      //con este metodo retornando true, avisa que es un Votante
      return true;
    }
    /*
     //Funcion cargar datos desde un csv
     public static void cargarInscritos(ArrayList<Votante> mesaVotante) throws IOException{
		String filePath = "personasInscritas.txt";
        private BufferedReader lectorTxt = new BufferedReader( new FileReader( filePath ) );
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
	}*/
}
