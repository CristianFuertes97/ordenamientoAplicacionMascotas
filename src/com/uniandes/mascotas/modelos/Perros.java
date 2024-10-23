package com.uniandes.mascotas.modelos;

public class Perros implements Comparable<Perros>{
    // Atrbutos
    private String nombre;
    private String raza;
    private int puntos;
    private int edad;

    // constructor

    public Perros(String nombre, String raza, int puntos, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.puntos = puntos;
        this.edad = edad;
    }

    // getters and setters

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPuntos() {
        return this.puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // ordenar por raza
    @Override
    public int compareTo(Perros otroPerro) {
        return this.getRaza().compareTo(otroPerro.getRaza());
    }

    @Override
    public String toString() {
        return 
            " Nombre: " + getNombre()+
            ", Raza: " + getRaza()+
            ", Puntos: " + getPuntos()+
            ", Edad: " + getEdad()+" meses";
    }


}
