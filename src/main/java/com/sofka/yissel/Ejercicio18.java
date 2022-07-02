package com.sofka.yissel;

import javax.sql.rowset.serial.SerialJavaObject;
import java.util.ArrayList;

public class Ejercicio18 {
    public static void main(String[] args) {
        ArrayList<Serie> series = new ArrayList<Serie>();
        ArrayList<Videojuego> juego = new ArrayList<Videojuego>();

        series.add(new Serie());
        series.add(new Serie());
        series.add(new Serie("Betty", "Fernando Gaitan")) ;
        series.add(new Serie("Orange is the new black",7,"Drama", "Jenji Kohan")) ;
        series.add(new Serie("The big bang theory", 12, "Comedia", "Chuck Lorre")) ;

        juego.add(new Videojuego("Assassin Creed", 200, "Aventura","UBISOFT"));
        juego.add( new Videojuego("Sims4", 150));
        juego.add(new Videojuego("Minecraft",50, "Aventura","Mojang"));
        juego.add(new Videojuego());
        juego.add(new Videojuego("GTA5", 45,"Accion","Rockstar")) ;

        series.get(0).entregar();
        juego.get(3).entregar();

        int contadorSerie = 0;
        int contadorJuegos = 0;

        for (int x = 0; x < 5; x++ ){
            if(series.get(x).isEntregado()){
                contadorSerie++;
                series.get(x).devolver();
            }
            if (juego.get(x).isEntregado()){
                contadorJuegos++;
                juego.get(x).devolver();
            }
        }
        System.out.println("Hay entregados "+contadorSerie+" series");
        System.out.println("Hay entregados "+contadorJuegos+" juegos");
        series.sort((Serie a, Serie b)-> a.compareTo(b));
        juego.sort((Videojuego a, Videojuego b)-> a.compareTo(b));
        System.out.println(series.get(4).toString());
        System.out.println(juego.get(4).toString());
    }
}
