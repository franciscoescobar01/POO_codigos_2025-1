package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("hola", "MUNDO", "Casa", "PEDRO");
        List<String> palabrasMayuscula=new ArrayList<>();
        for (String p : palabras){
            if(p.equals(p.toUpperCase())){
                palabrasMayuscula.add(p);
            }
        }
        System.out.println(palabrasMayuscula);
    }

    private static void agregarPalabras(List<String> palabras, List<String> palabrasMayuscula) {
        for (String p : palabras){
            if(p.equals(p.toUpperCase())){
                palabrasMayuscula.add(p);
            }
        }
    }
}