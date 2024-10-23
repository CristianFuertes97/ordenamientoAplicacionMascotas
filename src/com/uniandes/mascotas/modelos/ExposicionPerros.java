package com.uniandes.mascotas.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExposicionPerros {
    // Atributos
    private List<Perros> lista = new ArrayList<>();

    // getters and setters
    public List<Perros> getLista() {
        return lista;
    }

    public void setLista(List<Perros> lista) {
        this.lista = lista;
    }
    // Constructor vacio
    public ExposicionPerros(){
       
    }

    // Metodos

    public void agregarPerro(Perros perro){
        lista.add(perro);
    }
    
    public void mostrarLista(){
        for (Perros item : lista) { 
            System.out.println(item);
        }    
    }

    public void ordenarPorRaza(){
        Collections.sort(getLista());
     
    }

    public void ordenarPorEdad(){
        getLista().sort(Comparator.comparing(Perros::getEdad));
      
    }

    public void ordenarPorPuntos(){
        getLista().sort(Comparator.comparing(Perros::getPuntos));
       
    }

    public Perros buscarPerro(String nombre){
        Perros item = null;
        for (Perros perro : lista) {
            if (perro.getNombre().equals(nombre) ) {
                item = perro;
            }
        }
        return item;
    }

}
