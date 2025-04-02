package org.example;

import java.util.Arrays;

public class main7 {
    public static void main(String[] args) {
        String a = "a";
        System.out.println(a.matches("[a-zA-Z]"));

        int [] arr = new int[10];
        System.out.println("arr = " + arr);
        llenar(arr);
        System.out.println(Arrays.toString(arr));


        int [][]  mat = new int[4][7];
        System.out.println(mat.length);
        for (int i = 0; i < mat.length; i++) {
            llenar(mat[i]);
        }

        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }

    }

    private static void llenar(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
        }
    }


}
