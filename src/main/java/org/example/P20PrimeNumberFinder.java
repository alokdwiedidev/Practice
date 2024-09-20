package org.example;

public class P20PrimeNumberFinder {

    public static void main(String[] args) {
        int num =10;

        for (int i=2;i<num;i++){
            if (num%i==0){
                System.out.println("number is not prime");
                break;
            }else    System.out.println("Number is prime");

        }
    }
}
