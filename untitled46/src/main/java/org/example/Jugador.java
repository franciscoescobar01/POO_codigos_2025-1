package org.example;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private int puntos;
    private ArrayList<Carta> mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.mano = new ArrayList<>();
    }

    public void sacarCarta(Mazo mazo, int cantidadCartas){
        for (int i = 0; i < cantidadCartas; i++) {
            mano.add(mazo.repartirCarta());
        }
        calcularPuntos();
    }
    public void calcularPuntos(){
        int puntos = 0;
        for (Carta carta : mano) {
            puntos+= carta.getValor();
        }
        this.puntos = puntos;
    }
    public int getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        return nombre+ ":"+mano.toString();
    }
}
