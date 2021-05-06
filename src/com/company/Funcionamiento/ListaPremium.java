package com.company.Funcionamiento;

import com.company.Datos.Cancion;

import java.util.LinkedList;
import java.util.Scanner;

public class ListaPremium extends Listas{
    private LinkedList<Cancion> miLista;


    public ListaPremium(){
        super("LISTA PREMIUM");
        this.miLista = new LinkedList<Cancion>();
    }
    public ListaPremium(String nombre,LinkedList<Cancion> canciones) {
        super(nombre);
        this.miLista = canciones;
    }

    @Override
    public void Reproducir() {
        this.VerMiLista();
        Scanner sc = new Scanner(System.in);
        System.out.println("Que cancion reproducira?");
        for (Cancion aux : this.miLista) {
            if (sc.nextLine() == aux.getNombre()) {
                System.out.println(aux.toString());
            }
        }
    }

    @Override
    public void AgregarCancion(Cancion cancion) {
        this.miLista.add(cancion);
    }

    @Override
    public void EliminarCancion() {
        Scanner sc = new Scanner(System.in);
        this.VerMiLista();
        this.miLista.remove(sc.nextInt());
    }

    @Override
    public void VerMiLista() {
        int count =0;
        for (Cancion auxC : this.miLista) {
            System.out.println(count+") " + auxC.toString()+ "\n");
            count++;
        }
    }

    @Override
    public void CambiarCancion(Cancion cancion) {
        for (Cancion aux : this.miLista) {
            if (aux.equals(cancion)) {
                System.out.println(aux.toString());
            }
        }


    }
}