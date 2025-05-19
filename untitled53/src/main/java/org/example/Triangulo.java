package org.example;

public class Triangulo extends Figura {
    private double lado;
    private double altura;

    public Triangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public double area() {
        return lado*altura/2;
    }

    public void mostrar(){

    }
}
