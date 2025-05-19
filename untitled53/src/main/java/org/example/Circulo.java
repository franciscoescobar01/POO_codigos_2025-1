package org.example;

public class Circulo extends Figura {
    private int radio;
    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return 2*Math.PI*radio;
    }

    @Override
    public int compareTo(Figura o) {
        return 0;
    }
}
