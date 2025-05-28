package org.example;

public class Rut {
    private String rut;
    private int numero;
    private char dv;
    private boolean isValid;

    public Rut(){
    }

    public Rut(String rut){
        this.rut = formatRut();
        numero = extraerNumero();
        dv = extraerDV();
        isValid = isValid();
    }

    public char extraerDV() {
        return rut.toCharArray()[rut.length()-1];
    }

    public int extraerNumero() {
        String n = rut.substring(0, rut.length()-1);
        return Integer.parseInt(n);
    }

    public String formatRut(){
        return rut;
    }

    public boolean isValid() {
        return false;
    }
}
