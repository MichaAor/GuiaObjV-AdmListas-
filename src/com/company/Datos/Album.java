package com.company.Datos;

public class Album {
    private int anio;
    private String titulo;
    private Artista artista;

    public Album(String titulo,int anio, Artista artista) {
        this.titulo = titulo;
        this.anio = anio;
        this.artista = artista;
    }

    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Album{" +
                "anio=" + anio +
                ", titulo='" + titulo + '\'' +
                ", artista=" + artista +
                '}';
    }
}
