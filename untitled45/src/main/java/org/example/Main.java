package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1102	Sí	3

        String n = "1102";
        int iteracionesKaprekar = 0;
        if(isValid(n)){
            System.out.println("es valido");
            iteracionesKaprekar = kaprekar(n);
            System.out.println("iteracionesKaprekar = " + iteracionesKaprekar);
        }else{
            System.out.println("es invalido");
        }
    }

    private static int kaprekar(String n) {
        int kaprekar = 0;
        int resta = 0;
        do{
            while(n.length()<4){
                n="0"+n;
            }


            int[] digitosArr = new int[4];
            char[] digitosString = n.toCharArray();
            for (int i = 0; i < digitosString.length; i++) {
                digitosArr[i] = Integer.parseInt(String.valueOf(digitosString[i]));
            }
            System.out.println(Arrays.toString(digitosArr));
            Arrays.sort(digitosArr);
            int numeroMenor = ordenarMenor(digitosArr);
            int numeroMayor = ordenarMayor(digitosArr);
            System.out.println(numeroMayor);
            System.out.println(numeroMenor);

            resta = numeroMayor-numeroMenor;
            System.out.println("resta = " + resta);

            if(resta ==6174){
                System.out.println("se llego a la constante");
            }else{
                kaprekar++;
            }
            n=""+resta;
        }while(resta!=6174);

        return kaprekar;
        
    }

    private static int ordenarMayor(int[] arr) {
        String numero = "";
        for (int i = 0; i < arr.length; i++) {
            numero = arr[i]+numero;
        }
        return Integer.parseInt(numero);
    }
    private static int ordenarMenor(int[] arr) {
        String numero = "";
        for (int i = 0; i < arr.length; i++) {
            numero = numero+arr[i];
        }
        return Integer.parseInt(numero);
    }

    public static boolean isValid(String n){
        if(Integer.parseInt(n)==0){
            return false;
        }
        if(n.length()>4){
            return false;
        }

        int coincidencias = 0;
        char digito = n.charAt(0);
        for(int i=1;i<n.length();i++){
            if(digito==n.charAt(i)){
                coincidencias++;
            }
        }
        if(coincidencias==3){
            return false;
        }
        
        return true;
    }
}