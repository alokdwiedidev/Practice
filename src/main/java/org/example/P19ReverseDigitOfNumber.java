package org.example;
//Write a program to reverse digits of a number
public class P19ReverseDigitOfNumber {
    public static void main(String[] args) {


        int num = 12345;


            int reverseNumber=0;
        while (num!=0){
            int digit=num%10;
            reverseNumber=reverseNumber*10+digit;
            num/=10;

        }
        System.out.println("reverse of a number  : "+reverseNumber);


    }

}




