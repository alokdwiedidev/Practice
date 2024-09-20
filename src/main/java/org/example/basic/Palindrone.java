package org.example.basic;

import java.util.Scanner;

public class Palindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number you want to check palindrone..............");
        String str = "abcdcba";
        System.out.println(str.length());
        System.out.println(str.length());
        str = str.toLowerCase();

        boolean ispelindrone = true;
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                ispelindrone = false;
                break;
            }
        }
        if (ispelindrone) {
            System.out.println("String is pelindrone");
        } else {
            System.out.println(str + " is not a palindrome.");

        }
        int a = sc.nextInt();
        int b = a;
        int reverse = 0;
        while (a != 0) {
            int digit = a % 10;
            reverse = reverse * 10 + digit;

            a /= 10;
        }
        System.out.println(reverse);
        if (b == reverse) {
            System.out.println("Number Is palindrone......");
        } else System.out.println(" Number is not palindrone");
    }
}
