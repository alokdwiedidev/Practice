package org.example.basic;

public class LargestNum {
    public static void main(String[] args) {
        int a= 20;
        int b=55;
        int c=48;

        if (a>b && a>c){
            System.out.println("A is greater");
        }else if (b>a && b>c){
            System.out.println("B is greater");

        }else {
            System.out.println("C is greater");
        }
    }
}
