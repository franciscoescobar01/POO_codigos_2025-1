package org.example;

public abstract class Figura implements Comparable<Figura>{
    public abstract double area();
    //public abstract double perimetro();
    public final void mostrar(){
        System.out.println(this.getClass());
    }
}
