package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Leer archivo CSV pokemon
        String pokemonfile = GestorArchivos.leerArchivo("files/pokemon.csv");
        //System.out.println("pokemonfile = " + pokemonfile);
        String[] datosPokemon = pokemonfile.split("\n");
        //System.out.println("Arrays = " + Arrays.toString(datosPokemon));
        System.out.println(datosPokemon.length-1);

    }
}