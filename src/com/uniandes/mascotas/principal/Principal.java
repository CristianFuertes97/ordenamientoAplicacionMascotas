package com.uniandes.mascotas.principal;

import java.util.List;
import java.util.Scanner;

import com.uniandes.mascotas.modelos.ExposicionPerros;
import com.uniandes.mascotas.modelos.Perros;

public class Principal {
    public static void main(String[] args) {
        // importamos Scanner
        Scanner sc = new Scanner(System.in);

         // Creamos lista de perros
        Perros perro1 = new Perros("Leviatan", "Chiuahua", 40, 38);
        Perros perro2 = new Perros("Taylor", "Akita", 90, 12);
        Perros perro3 = new Perros("Puppy", "Gran Danes", 70, 10);
        Perros perro4 = new Perros("Brutal y Mamut", "Doberman", 80, 13);
        Perros perro5 = new Perros("Cobrador", "Beagle", 50, 18);
        Perros perro6 = new Perros("Fido", "Mastin Napolitano", 90, 24);
        Perros perro7 = new Perros("Tony", "Bull Terrier", 70, 30);
        Perros perro8 = new Perros("Nieve", "Gigante de los Pireneos", 36, 40);
        Perros perro9 = new Perros("Titan", "Pug", 48, 25);
        Perros perro10 = new Perros("Tarzan", "Gosque", 66, 45);
        Perros perro11 = new Perros("Maximus", "Mastin Español", 55, 27); 

        // agragamos a lista
        var exposicion = new ExposicionPerros();
        exposicion.agregarPerro(perro1);
        exposicion.agregarPerro(perro2);
        exposicion.agregarPerro(perro3);
        exposicion.agregarPerro(perro4);
        exposicion.agregarPerro(perro5);
        exposicion.agregarPerro(perro6);
        exposicion.agregarPerro(perro7);
        exposicion.agregarPerro(perro8);
        exposicion.agregarPerro(perro9);
        exposicion.agregarPerro(perro10);
        exposicion.agregarPerro(perro11);

        // INTERFAZ DE LA APLICACION
        System.out.println("BIENVENIDOS AL SISTEMA EXPOSICION MASCOTAS");
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("""
                *************************************
                    1.Mostrar lista de perros 
                    2.Registrar un nuevo perro
                    3.Buscar perro por su nombre
                    4.Perro ganador
                    5.Perro perdedor
                    6.Perro mas viejo
                    0.Salir
                ****************************************
                    """);
            System.out.println("Ingrese una opción");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Desea ordenar su lista");
                    System.out.println("""
                            1.Ordenar por Raza
                            2.Ordenar por puntos
                            3.Ordenar por Edad
                            """);
                    int valor = sc.nextInt();
                    if (valor == 1) {
                        exposicion.ordenarPorRaza();
                        System.out.println("Lista ordenada por Raza:");
                        exposicion.mostrarLista();
                    }else if(valor == 2){
                        exposicion.ordenarPorPuntos();
                        System.out.println("Lista ordenada por Puntos:");
                        exposicion.mostrarLista();
                    }else if(valor == 3){
                        exposicion.ordenarPorEdad();
                        System.out.println("Lista ordenada por Edad");
                        exposicion.mostrarLista();
                    }else{
                        
                        exposicion.mostrarLista();
                    }
                    break;
                case 2:
                    System.out.println("Ingresar nuevo perro:");
                    System.out.println("Nombre: ");
                    String nombre = sc.next();
                    System.out.println("Raza: ");
                    String raza = sc.next();
                    System.out.println("Edad (meses)");
                    int edad = sc.nextInt();
                    System.out.println("Puntos: ");
                    int puntos = sc.nextInt();
                    Perros nuevo = new Perros(nombre, raza, puntos, edad);
                    exposicion.agregarPerro(nuevo);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del perro a buscar");
                    String nombres = sc.next();
                    if (exposicion.buscarPerro(nombres) != null) {
                        System.out.println(exposicion.buscarPerro(nombres));
                    }else{
                        System.out.println("PERRO NO ESTA EN LA LISTA");
                    }
                    break;
                case 4:
                    exposicion.ordenarPorPuntos();
                    List<Perros> lista = exposicion.getLista();
                    System.out.println("PERRO GANADOR!!!");
                    System.out.println(lista.get((lista.size())-1));
                    break;
                case 5:
                    exposicion.ordenarPorPuntos();
                    List<Perros> pun = exposicion.getLista();
                    System.out.println("PERRO PERDEDOR!!!");
                    System.out.println(pun.get(0));
                    break;
                case 6:
                    exposicion.ordenarPorEdad();
                    List<Perros> listas = exposicion.getLista();
                    System.out.println("PERRO MÁS VIEJO");
                    System.out.println(listas.get((listas.size())-1));
                    break;
                case 0:
                    System.out.println("Saliendo del sistema............");
                    break;
                default:
                    System.out.println("Ingrese una popcion correcta!!!");
                    break;
                    
            }
        }
        sc.close();
        
    }
}
