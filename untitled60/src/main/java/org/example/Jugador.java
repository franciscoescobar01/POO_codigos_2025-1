package org.example;

public class Jugador {
    private String nombre;
    private String deporte;
    private int puntuacion;
    private String equipo;


    public String getNombre() {
        return nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public String getEquipo() {
        return equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", deporte='" + deporte + '\'' +
                ", puntuación=" + puntuacion +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}
