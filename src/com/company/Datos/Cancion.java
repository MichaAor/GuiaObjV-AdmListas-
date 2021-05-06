package com.company.Datos;

import com.company.Datos.Album;

public class Cancion {
    private String nombre;
    private int duracion;
    private String genero;
    private Album album;
    private Artista artistaInvitado;

    public Cancion(String nombre, int duracion, String genero, Album album, Artista artistaInvitado) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.album = album;
        this.artistaInvitado = artistaInvitado;
    }

    public Cancion(String nombre, int duracion, String genero, Album album) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.album = album;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return this.duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Album getAlbum() {
        return this.album;
    }
    public void setAlbum(Album album) {
        this.album = album;
    }


    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + this.nombre + '\'' +
                ", duracion=" + this.duracion +
                ", genero='" + this.genero + '\'' +
                ", album=" + this.album +
                '}';
    }
}
