package com.company.Funcionamiento;

import com.company.Datos.Cancion;

import java.util.Stack;

public class ListaBasica extends Listas {
    private Stack<Cancion> miLista;

    public  ListaBasica(){
        super("LISTA BASICA");
        this.miLista = new Stack<>();
    }
    public ListaBasica(String nombre,Stack<Cancion> canciones) {
        super(nombre);
        this.miLista =canciones;

    }

    @Override
    public void Reproducir() {
        Cancion actual = this.miLista.pop();
        System.out.println("Se esta reproduciendo: " + actual.toString());
    }

    @Override
    public void AgregarCancion(Cancion cancion) {
        this.miLista.push(cancion);
    }

    @Override
    public void EliminarCancion() {
        System.out.println("Para acceder a esta funcion, compre el paquete PREMIUM");
    }

    @Override
    public void VerMiLista() {
        int count = 0;
        for(Cancion auxC : this.miLista){
            System.out.println(count+") " + auxC.toString()+"\n");
            count++;
        }
    }

    @Override
    public void CambiarCancion(Cancion cancion) {
        System.out.println("Para acceder a esta funcion, compre el paquete PREMIUM");
    }


}
