package org.example;

public class Persona {
    //atributos
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public boolean esMayor(Persona persona) {
        return edad > persona.edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void cumplirAño() {
        this.edad = this.edad + 1;
    }
}
