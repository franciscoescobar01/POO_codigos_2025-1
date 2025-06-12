package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("hola", "MUNDO", "Casa", "PEDRO");
        List<String> palabrasMayuscula;

        palabrasMayuscula = palabras.stream()
                .filter( p -> p.equals(p.toUpperCase()))
                .collect(Collectors.toList());

        System.out.println(palabrasMayuscula);
    }
}
