package com.mycompany.gestionvotantes;

import java.io.*;
import java.util.*;

/**
 *
 * @author esteb
 */

public class Menu {
    /* Declaración de variables */
    int choose = 100; // Opción por defecto para entrar al menú
    Scanner leer = new Scanner(System.in); // Para leer información
    
    /* Funciones */
    
    // Menú de opciones
    public void desplegarMenu(LugarVotacion valpo) {
        System.out.println("Bienvenido al programa de gestión de votamtes\n");
       
        do {
            System.out.println("Menú de opciones");
            System.out.println("------------------------------------");
            System.out.println("(1) Crear votante");
            System.out.println("(2) Crear mesa");
            System.out.println("(3) Mostrar Todo");
            System.out.println("(4) Buscar por RUT");
            System.out.println("(5) Eliminar por RUT");
            System.out.println("(6) Eliminar mesa");
            System.out.println("------------------------------------\n");
            System.out.print("Elija una opción: ");
            choose = verificarEntero();
                
            // Selección de opciones
            switch(choose) {
                // Opción 1 - Agregar un nuevo votante
                case 1: {
                    // Variables para datos de un votante
                    String name;
                    String rut;
                    int nMesa;
                        
                    // Pedir por pantalla
                    System.out.println("-- CREAR VOTANTE --");
                    System.out.println("NOMBRE");
                    System.out.println("Introduzca el nombre del votante: " );
                    name = leer.nextLine();
                    System.out.println("Introduzca el RUT sin puntos ni guión: ");
                    rut = leer.nextLine();

                    // Se verifica si la mesa existe
                    System.out.println("Introduzca el número de Mesa");
                    nMesa = verificarEntero(); // Leer el número de mesa
                    
                    // Si la mesa no existe, se lanza excepción de mesa no está creada
                    if(valpo.mesaExiste(nMesa) == false) {
                        System.out.println("Indique un mesa existente o cree la mesa");
                        //throw ExceptionMesaNoCreada;
                        break;
                    }
                    System.out.println(" ");

                    // Con el contructor se crea el votante. Se agrega a la mesa sólo si esta última existe.
                    Votante nuevoVotante = new Votante(name, rut, nMesa);
                    valpo.agregarVotanteAMesa(nuevoVotante, nMesa);
                        
                    break; 
                }

                // Opción 2 - Creación de una mesa
                case 2: {
                    // Declaración de variables - Clave de la mesa
                    int id;

                    // Pedir por pantalla
                    System.out.println("-- CREAR MESA --");
                    System.out.println("Introduzca el número de la mesa ");
                    id = verificarEntero(); // Leer el número de mesa

                    // Se comprueba si la mesa ya existe
                    if(valpo.mesaExiste(id) == true){
                        System.out.println("MESA YA EXISTE");

                        break; 
                    }
                    
                    // Se crea la nueva mesa. Se agrega sólo si la mesa no existe.
                    Mesa nuevaMesa = new Mesa(id);
                    valpo.crearMesa(nuevaMesa);
                    
                    break;
                }

                // Opción 3 - Mostrar todas las mesas y sus votantes
                case 3: {
                    System.out.println("-- MOSTRAR TODO --");
                    valpo.mostrarTodo();
                    
                    break;
                }

                // Opción 4 - Buscar votante por RUT
                case 4: {
                    // Declaración de variables - RUT del votante
                    String rut;

                    // Pedir por pantalla
                    System.out.println("-- BUSCAR VOTANTE POR RUT --");
                    System.out.println ("Ingrese el RUT a buscar: ");
                    rut = leer.nextLine();
                    System.out.println();

                    // Función que busca al votante e imprime sus datos
                    valpo.buscarRut(rut);

                    break;
                }

                // Opción 5 - Eliminar votante por RUT
                case 5: {
                    // Declaración de variables - RUT del votante
                    String rut;

                    // Pedir por pantalla
                    System.out.println("-- ELIMINAR VOTANTE POR RUT --");
                    System.out.println("Ingrese RUT a borrar: ");
                    rut = leer.nextLine();
                    System.out.println();

                    // Función que elimina al votante
                    valpo.eliminarPorRut(rut);
                    
                    break;
                }

                //Opción 6
                case 6: {
                    System.out.println("-- MOSTRAR POR MESA --");
                    break;
                }

                default: {
                    break;
                }
            }
        } while(choose != 0);  
    }
                    
    // Función para verificar si el dato ingresado se trata de un número o no
    private int verificarEntero() {
        int id = 0; // Número de mesa
        boolean esNumeroValido = false; // Por defecto

        // Validar el número ingresado por el usuario
        while(!esNumeroValido) {
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
}// Final de clase