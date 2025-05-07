package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Recurso r0 = new Recurso(1, 10,"camara");
        Recurso r1 = new Recurso(2, 20,"microfono");
        Recurso r2 = new Recurso(3, 30,"ecenografia");

        Persona p0 = new Persona("Natalia", "Actor", "n@pelicula.cl",10);
        Persona p1 = new Persona("Pedro", "Camarografo", "p@pelicula.cl",6);
        Persona p2 = new Persona("Manuel", "Actor", "m@pelicula.cl",5);

        Pelicula pelicula0 = new Pelicula("p", new Date(System.currentTimeMillis()));
        pelicula0.addEquipo(p0);
        pelicula0.addEquipo(p1);
        pelicula0.addEquipo(p2);
        pelicula0.addRecurso(r0);

        pelicula0.iniciar();
        System.out.println(pelicula0);
        pelicula0.terminar();









    }
}