package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> cartas;

    public Mazo() {
        cartas = new ArrayList<>();
    }

    public void generarMazo(){
        int[] valores = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        String[] pintas = {"♤","♧","♥","♦"};
        String[] simbolos = {"a", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for(int i = 0; i < valores.length; i++){
            for(int j = 0; j < pintas.length; j++){
                cartas.add(new Carta(valores[i],pintas[j],simbolos[i]));
            }
        }

    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    @Override
    public String toString() {
        return cartas.toString();
    }

    public void barajar(){
//        for (int i = 0; i < 10000; i++) {
//            Carta carta = cartas.get(0);
//            cartas.remove(0);
//            int n = (int)(Math.random()*cartas.size());
//            cartas.add(n, carta);
//        }
        Collections.shuffle(cartas);

    }

    public Carta repartirCarta() {
        Carta carta = cartas.get(0);
        cartas.remove(0);
        return carta;
    }
}
