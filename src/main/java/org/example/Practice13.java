package org.example;

import java.util.Scanner;

//Program for factorial of a number
public class Practice13 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter the number you want the factorial of");

        int a = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial = i * factorial;
        }
        System.out.println("FACTORIAL  :  " + factorial);
    }

}



