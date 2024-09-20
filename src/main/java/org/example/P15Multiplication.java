package org.example;

import java.util.Scanner;

public class P15Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the multiplication of..... ");
        int num= sc.nextInt();

        for (int i=1;i<=10;i++){
            int multiple= num*i;
            System.out.println(num+" * "+i+" = "+multiple);
//            System.out.println(multiple);
        }
    }
}
