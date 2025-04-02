package org.example;

public class main6 {
    public static void main(String[] args) {
        int a = suma( 5, 6, 5,7, 9, 67, 4,34,4,45,45,54,6,4,56,4,56,4,56);
        System.out.println("suma = " + a);
    }
    public static int suma(int ... a) {
        int sum = 0;
        System.out.println(a);
        for(int i:a){
            sum += i;
        }
        return sum;
    }


}
