package org.example.basic;

public class CommonDigitCheck {
    public static void main(String[] args) {

        int num1 = 53;
        int num2 = 58;

        while (num1 != 0) {
            int digit = num1 % 10;
            num1 /= 10;

            int num2Digit = num2 % 10;
            num2 /= 10;

            if (num2Digit == digit) {
                System.out.println(true);
            }
        }
    }
}