package com.company.Funcionamiento;

public abstract class Listas implements Reproduccion {
    private String nombre;

    public Listas(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
