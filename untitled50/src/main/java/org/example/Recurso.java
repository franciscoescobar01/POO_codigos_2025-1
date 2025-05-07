package org.example;

public class Recurso {
    private int id;
    private int precio;
    private boolean disponible;
    private String nombre;

    public Recurso(int id, int precio, String nombre) {
        this.id = id;
        this.precio = precio;
        this.disponible = true;
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void ocupar() {
        this.disponible = false;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Recurso{" +
                "id=" + id +
                ", precio=" + precio +
                ", disponible=" + disponible +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}