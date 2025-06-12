package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Ana Ruiz",        19,  85),
                new Estudiante("Bruno Pérez",     20,  78),
                new Estudiante("Carla Soto",      18,  92),
                new Estudiante("Diego Torres",    21,  67),
                new Estudiante("Elena Vidal",     22,  88),
                new Estudiante("Fernando León",   23,  73),
                new Estudiante("Gabriela Mora",   20,  95),
                new Estudiante("Hugo Salas",      19,  81),
                new Estudiante("Isabel Rivas",    24,  69),
                new Estudiante("Javier Silva",    18,  90),
                new Estudiante("Karla Fuentes",   22,  76),
                new Estudiante("Luis Cáceres",    21,  84),
                new Estudiante("María López",     20,  93),
                new Estudiante("Nicolás Vera",    19,  72),
                new Estudiante("Olga Cifuentes",  23,  88),
                new Estudiante("Pablo Gutiérrez", 24,  65),
                new Estudiante("Quintín Arias",   18,  91),
                new Estudiante("Rosa Medina",     22,  79),
                new Estudiante("Sergio Núñez",    21,  87),
                new Estudiante("Tamara Ibarra",   20,  94)
        );

        //System.out.println(estudiantes);

        List<Estudiante> superior90 = estudiantes.stream()
                .filter(e->e.getCalificaciones()>=90)
                .toList();
        System.out.println("superior90 = " + superior90);


        
    }

}