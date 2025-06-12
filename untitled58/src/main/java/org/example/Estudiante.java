package org.example;

public class Estudiante {
    private String nombre;
    private int edad;
    private int calificaciones;

    public Estudiante(String nombre, int edad, int calificaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", calificaciones=" + calificaciones +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getCalificaciones() {
        return calificaciones;
    }
}
