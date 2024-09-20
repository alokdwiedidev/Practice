package org.example;

//12321

public class Practice7 {
    public static void main(String[] args) {
        int b=1234321;
        int a = b;


        int reverse = 0;
        while (a != 0) {
            int digit = a % 10;
            reverse = reverse * 10 + digit;
                   a/=10;
        }
if (b==reverse){
    System.out.println("number is pelindrone");
}else System.out.println("number is not pelindrone");
    }
}
