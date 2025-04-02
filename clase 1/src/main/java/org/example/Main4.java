package org.example;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num;
        try{
         //algo podria fallar
            num = sc.nextInt();
        }catch(Exception e){
            //fallo
            System.err.println("no es un numero");
            //acciones
            num = 0;
        }
        System.out.println(num);
        //
    }
}
