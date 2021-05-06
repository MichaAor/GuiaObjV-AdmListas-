package com.company;

import com.company.Funcionamiento.ListaBasica;
import com.company.Funcionamiento.ListaPremium;
import com.company.Funcionamiento.Menu;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rt = 0;
        do {
            System.out.println("Bienvenido al sistema PowerFy\n " +
                    "Elija a que suscripcion Corresponde (0 para salir): \n" +
                    "1) Utilizar Lista Basica\n" +
                    "2) Utilizar Lista Premium\n");
            rt = sc.nextInt();
            switch (rt) {
                case 1:
                    Menu menuB = new Menu(new ListaBasica());
                    menuB.menuLista();
                    break;
                case 2:
                    Menu menuP = new Menu(new ListaPremium());
                    menuP.menuLista();
                    break;
                case 0:
                    break;
            }

        }while(rt != 0);
        System.out.println("Cerrando sistema");
    }
}
