
package com.mycompany.gestionvotantes;


/**
 *
 * @author esteb
 */

public class Votante extends Persona {
   
    //constructor
    
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
<<<<<<< HEAD
=======
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
	}
	
=======
>>>>>>> Stashed changes
>>>>>>> f3b370f7f0e341df439fdec7b2d927ba54555e98*/
}
