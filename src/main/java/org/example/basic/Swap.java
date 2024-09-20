package org.example.basic;

public class Swap {
    public static void main(String[] args) {
        int a=13;
        int b=17;

         a= a+b;
         b=a-b;
         a=a-b;

        System.out.println(a);
        System.out.println(b);
    }
}
