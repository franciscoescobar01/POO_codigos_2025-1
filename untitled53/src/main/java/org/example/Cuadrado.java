package org.example;

public class Cuadrado extends Figura {
   private int lado;
   public Cuadrado(int lado) {
       this.lado = lado;
   }

    @Override
    public double area() {
        return lado*lado;
    }
}
