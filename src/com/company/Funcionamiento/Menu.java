package com.company.Funcionamiento;

import com.company.Datos.Album;
import com.company.Datos.Artista;
import com.company.Datos.Cancion;
import com.company.Datos.Genero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Menu {
        List<Cancion> cancionList;
        Listas miLista;

        Scanner sc;

        public Menu(Listas miLista){
                this.cancionList = cargarCanciones();
                this.miLista = miLista;
                this.sc = new Scanner(System.in);
        }

        public void menuLista(){
          int rt = 0;
          do{
                  System.out.println("MENU LISTA,ELIJA (0 para salir): " +
                          "\n 1) Reproducir" +
                          "\n 2) Ver mi Lista" +
                          "\n 3) Añadir Cancion" +
                          "\n 4) Eliminar Cancion");
                  rt = this.sc.nextInt();
                  switch (rt){
                      case 1:
                          this.miLista.Reproducir();
                          break;
                      case 2:
                          this.miLista.VerMiLista();
                          break;
                      case 3:
                          System.out.println("Elija la cancion a agregar");
                          this.miLista.AgregarCancion(mostrarCanciones());
                          break;
                      case 4:
                         this.miLista.EliminarCancion();
                         break;
                      case 0:
                          break;
                      default:
                          System.out.println("Ingreso una opcion no valida,por favor,Reintente :D");
                  }
          }while(rt != 0);

        }

    public Cancion mostrarCanciones(){
            int count = 0;
            for(Cancion auxC : this.cancionList){
                System.out.println(count+") "+ auxC.toString());
                count++;
            }
            count = sc.nextInt();
            Cancion elegida = this.cancionList.get(count);
        return elegida;
        }

    public static List<Cancion> cargarCanciones() {
        List<Cancion> canciones = new ArrayList<Cancion>();

        Artista disturbed = new Artista("Disturbed", 25, "ESTADOUNIDENSE");
        Album theSickness = new Album("The Sickness", 2000, disturbed);
        Cancion downWithTheSickness = new Cancion("Down With The Sickness", 4, Genero.METAL, theSickness);

        canciones.add(downWithTheSickness);


        Artista gunsNRoses = new Artista("Guns 'n Roses", 34, "ESTADOUNIDENSE");
        Album appetiteForDestruction = new Album("Appetite for Destruction", 1987, gunsNRoses);
        Cancion sweetChildOMine = new Cancion("Sweet Child o' Mine", 5, Genero.ROCK, appetiteForDestruction);

        canciones.add(sweetChildOMine);

        Artista billieEilish = new Artista("Billie Eilish", 18, "ESTADOUNIDENSE");
        Album whenWeAllFallAsleep = new Album("When We All Fall Asleep, Where Do We Go?", 2019, billieEilish);
        Cancion badGuy = new Cancion("Bad Guy", 3, Genero.POP, whenWeAllFallAsleep);

        canciones.add(badGuy);

        Artista queen = new Artista("Queen", 45, "INGLES");
        Artista davidBowie = new Artista("David Bowie", 69, "ESTADOUNIDENSE");
        Album hotSpace = new Album("Hot Space", 1982, queen);
        Cancion underPressure = new Cancion("Under Pressure", 5, Genero.ROCK, hotSpace, davidBowie);

        canciones.add(underPressure);

        Album newsOfTheWorld = new Album("News Of The World", 1977, queen);
        Cancion weWillRockYou = new Cancion("We Will Rock You", 5, Genero.ROCK, newsOfTheWorld);

        canciones.add(weWillRockYou);

        Artista gorillaz = new Artista("Gorillaz", 21, "INGLES");
        Album demonDays = new Album("Demon Days", 2005, gorillaz);
        Cancion feelGoodInc = new Cancion("Feel Good Inc", 4, Genero.ROCK, demonDays);

        canciones.add(feelGoodInc);

        Artista michaelJackson = new Artista("Michael Jackson", 50, "ESTADOUNIDENSE");
        Album bad = new Album("Bad", 1987, michaelJackson);
        Cancion smoothCriminal = new Cancion("Smooth Criminal", 5, Genero.POP, bad);

        canciones.add(smoothCriminal);


        Artista theWeeknd = new Artista("The Weeknd", 30, "CANADIENSE");
        Artista daftPunk = new Artista("Daft Punk", 26, "FRANCES");
        Album starboy = new Album("Starboy", 2016, theWeeknd);
        Cancion iFeelItComing = new Cancion("I Feel It Coming", 4, Genero.POP, starboy, daftPunk);

        canciones.add(iFeelItComing);

        Artista theStrokes = new Artista("The Strokes", 21, "ESTADOUNIDENSE");
        Album roomOnFire = new Album("Room On Fire", 2003, theStrokes);
        Cancion reptilia = new Cancion("Reptilia", 4, Genero.POP, roomOnFire);

        canciones.add(reptilia);

        Album randomAccessMemories = new Album("Random Access Memories", 2013, daftPunk);
        Cancion instantCrush = new Cancion("Instant Crush ", 4 , Genero.POP, randomAccessMemories,theStrokes);

        canciones.add(instantCrush);

        return canciones;
    }
}
