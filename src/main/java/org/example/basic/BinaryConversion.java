package org.example.basic;
//Write a Java program to convert an integer number to a binary number.
//Input Data:
//Input a Decimal Number : 5
public class BinaryConversion {
    public static void main(String[] args) {
        int  num= 5;
        String binaryString = Integer.toBinaryString(num);
        System.out.println(binaryString);
        System.out.println(" java version  :"+ System.getProperty("java.version"));
    }
}
