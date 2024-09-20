package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int num = scanner.nextInt();
        int num1 = 12321;
        int reverse = 0;
        while (num1 > 0) {
            int num2 = num1 % 10;
            reverse = reverse * 10 + num2;
            num1 /= 10;
        }
        if (reverse == num) {
            System.out.println("pelindrone");
        } else System.out.println("NO .....");
    }
}