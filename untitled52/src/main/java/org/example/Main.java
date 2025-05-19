package org.example;

public class Main {
    public static void main(String[] args) {
        C obj = new D();
        obj.p(obj);
        ((D)obj).p(obj);
        obj.p((D) obj);
        
        C obj1 = new C();
        obj1.p(obj);
    }
}