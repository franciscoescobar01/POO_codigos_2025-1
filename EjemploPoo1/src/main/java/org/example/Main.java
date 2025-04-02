package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Felipe", 21);
        p1.cumplirAño();
        System.out.println("p1 = " + p1);
        Persona p2 = new Persona("Emilia", 31);

        //¿quien es mayor? p  y p2

        if(p1.esMayor(p2)){
            System.out.println(p1 + " es mayor que " + p2);
        }else if(p2.esMayor(p1)){
            System.out.println(p2 + " es menor que " + p1);
        }else{
            System.out.println(p1 + " es igual a " + p2);
        }
    }
}