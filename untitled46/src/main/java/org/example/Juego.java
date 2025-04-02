package org.example;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Mazo mazo;
    private Jugador ganador;

    public Juego(Mazo mazo){
        this.mazo = mazo;
        jugadores = new ArrayList<>();
        ganador = null;
    }
    

}
