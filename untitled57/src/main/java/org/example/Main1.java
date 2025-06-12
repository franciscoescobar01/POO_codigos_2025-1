package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("hola", "MUNDO", "Casa", "PEDRO");
        List<String> palabrasMayuscula;

        palabrasMayuscula = palabras.stream()
                .filter(Main1::esMayuscula)
                .collect(Collectors.toList());

        System.out.println(palabrasMayuscula);

    }

    public static boolean esMayuscula(String p){
        return p.equals(p.toUpperCase());
    }


}
