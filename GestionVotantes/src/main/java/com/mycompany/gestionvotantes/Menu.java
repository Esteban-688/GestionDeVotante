package com.mycompany.gestionvotantes;


import java.io.*;
import java.util.*;


/**
 *
 * @author esteb
 */
public class Menu {
    //clase sobre el menu y pedir datos desde pantalla
    int choose = 100;
    
    Scanner leer = new Scanner(System.in);
    
    public void desplegarMenu(LugarVotacion valpo){
        //Menú de opciones
    //try{
       System.out.println("Bienvenido al programa de gestión de votacion\n");
       
       do {
                System.out.println("Menú de opciones");
                System.out.println("------------------------------------");
                System.out.println("(1) Crear votante");
                System.out.println("(2) Crear mesa");
                System.out.println("(3) Mostrar Todo");
                System.out.println("(4) Buscar por RUT");
                System.out.println("(5) Eliminar por RUT");
                System.out.println("(6) Crear Vocal");
                System.out.println("(7) Cambiar Votante a Vocal ");
                System.out.println("(8) Eliminar Mesa");
                System.out.println("------------------------------------\n");
                System.out.print("Elija una opción: ");
                choose = verificarEntero();
                
                //Selección de opciones
                switch(choose) {
                    case 1: {
                        //declaration Variable
                        String name;
                        String rut;
                        int nMesa;
                        
                        //pedir por pantalla
                        System.out.println("-- CREAR VOTANTE --");
                        System.out.println("NOMBRE");
                        System.out.println("Introduzca el nombre del votante: " );
                        name = leer.nextLine();
                        System.out.println("Introduzca el RUT sin puntos ni guión: ");
                        rut = leer.nextLine();
                        //aca se verifica si la mesa existe
                        System.out.println("Introduzca el Número de Mesa");
                        nMesa = verificarEntero();
                        //si la mesa no existe se lanza exception de mesa no esta creada
                        if(valpo.mesaExiste(nMesa) == false){
                            System.out.println("Seleccione un mesa existente o cree la mesa");
                            //throw ExceptionMesaNoCreada;
                            break;
                        }
                        System.out.println(" ");
                        //Con el contructor se crea el votante 
                        Votante nuevoVotante = new Votante(name, rut, nMesa);
                        //con esta funcion se agrega a la mesa pedida SOLO SI EXISTE
                        valpo.agregarPersonaAMesa(nuevoVotante, nMesa);
                        
                       break; 
                    }

                    case 2: {
                        //declaration variable
                        int id;
                        System.out.println("-- CREAR MESA --");
                        System.out.println("Introduzca el número de la mesa ");
                        id = verificarEntero();
                        if(valpo.mesaExiste(id)== true ){
                            System.out.println("MESA YA EXISTE");
                            break;
                        }
                        Mesa nuevaMesa = new Mesa(id);
                        valpo.crearMesa(nuevaMesa);
                        break;
                    }

                    case 3: {
                        System.out.println("-- MOSTRAR TODO --");
                        valpo.mostrarTodo();
                        break;
                    }

                    case 4: {
                        System.out.println("-- BUSCAR POR RUT --");
                        String rut;
                        System.out.println ("Ingrese el RUT a buscar: ");
                        rut = leer.nextLine();
                        System.out.println();
                        //funcion que busca e imprime votante
                        valpo.buscarRut(rut);
                        break;
                    }

                    case 5: {
                        //declaration Variable
                        String rut;
                        System.out.println("-- ELIMINAR VOTANTE POR RUT --");
                        //Se pide el rut del votante a borrar
                        System.out.println("Ingrese RUT a borrar: ");
                        rut = leer.nextLine();
                        System.out.println();
                        //funcion que elimina
                        valpo.eliminarPorRut(rut);
                        break;
                    }

                    case 6: {
                        
                        //declaration Variable
                        
                        String contraseña;
                        String name;
                        String rut;
                        int nMesa;
                        
                        //pedir por pantalla
                        System.out.println("-- CREAR VOCAL --");
                        System.out.println("NOMBRE");
                        System.out.println("Introduzca el nombre del vocal: " );
                        name = leer.nextLine();
                        System.out.println("Introduzca el RUT sin puntos ni guión: ");
                        rut = leer.nextLine();
                        //aca se verifica si la mesa existe
                        System.out.println("Introduzca el Número de Mesa");
                        nMesa = verificarEntero();
                        //si la mesa no existe se lanza exception de mesa no esta creada
                        if(valpo.mesaExiste(nMesa) == false){
                            System.out.println("Seleccione un mesa existente o cree la mesa");
                            //throw ExceptionMesaNoCreada;
                            break;
                        }
                        // comprueba si ya existe un vocal en mesa, retorna True si existe un vocal en mesa, sino retorna false
                        if(valpo.vocalEnMesa(nMesa) == true){
                            System.out.println("Seleccione una mesa donde no exista Vocal");
                            break;
                        }
                        //se pedira contraseña, asumiendo que solo hay un vocal por mesa;
                        System.out.println("Introduzca una contraseña");
                        contraseña = leer.nextLine();
                        System.out.println("Para Ingresar tenga en cuenta que el USUARIO es su nombre: " + name);
                        System.out.println(" ");
                        //Con el contructor se crea el votante 
                        Vocal nuevoVocal = new Vocal(name, rut, nMesa, contraseña);
                        //con esta funcion se agrega a la mesa pedida SOLO SI EXISTE
                        valpo.agregarPersonaAMesa(nuevoVocal, nMesa);
                        
                       break;
                      
                    } 
                    case 7:{
                        //funcion especial
                        System.out.println("--CAMBIAR VOTANTE A VOCAL--");
                        System.out.println("Ingrese rut del Votante");
                        String rut = leer.nextLine();
                        System.out.println("Ingrese Contraseña");
                        String contraseña = leer.nextLine();
                        //este metodo busca, y si encuentra el votante le devuelve como Vocal
                        if(valpo.cambiaVotantePorVocal(rut, contraseña) == false){
                            System.out.println("no existe votante");
                            break;
                        }
                        valpo.eliminarPorRut(rut, true);
                      break;
                    }
                    case 8:{
                        //declaration variable
                        int numeroMesa;
                        System.out.println("--ELIMINAR MESA--");
                         //Se pide la mesa a borrar
                        System.out.print("Ingrese número de mesa a borrar: ");
                        numeroMesa = verificarEntero();
                        if(valpo.mesaExiste(numeroMesa)== false ){
                            System.out.println("MESA NO EXISTE");
                            break;
                        }
                        valpo.eliminarMesa(numeroMesa);
                       break;  
                    }

                    default: {
                        break;
                    }
                }
            } while(choose != 0);
   /* }
    catch(IOException e){
    
    }
    catch(ExceptionMesaNoCreada){
        }*/
        
}
                    
    //algunas funciones
    private int verificarEntero(){

         int id = 0;//numero de mesa
         boolean esNumeroValido = false;

         // Validar el número ingresado por el usuario
         while (!esNumeroValido) {
             //System.out.println("Introduzca un Número : ");
             String entradaId = leer.nextLine();

             // Verificar si la entrada es un número entero
             try {

                 id = Integer.parseInt(entradaId);
                 esNumeroValido = true;
                 
             } catch (NumberFormatException e) {
                 System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
             }
         }
         return id;
    }
}//final de clase