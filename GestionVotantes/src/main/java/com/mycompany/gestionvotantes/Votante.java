
package com.mycompany.gestionvotantes;


/**
 *
 * @author esteb
 */

public class Votante extends Persona {
   
    //constructores
    
    public Votante(String nombre, String rutVotante, int numeroMesa) {
       super(nombre, rutVotante, numeroMesa);
        
    } 
    
    //metodo abstract desde Persona
    @Override
    public boolean retornaTipo(){
      //con este metodo retornando true, avisa que es un Votante
      return true;
    }
    
<<<<<<< Updated upstream
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
	
=======
>>>>>>> Stashed changes
}
