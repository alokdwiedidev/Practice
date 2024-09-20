package org.example;

import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name......");
        String name = sc.nextLine();
        System.out.println("Hii   "+ name +" enter the first number......");
        int a= sc.nextInt();
        System.out.println("enter the Second number......");
        int b= sc.nextInt();

        int sum= a+b;

        System.out.println(name+" the sum of "+a +" and"+b+ " is "+sum);
        sc.close();
    }
}
