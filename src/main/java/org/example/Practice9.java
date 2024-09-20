package org.example;

//Given a number n, check if it is a perfect square or not.
public class Practice9 {
    public static void main(String[] args) {
        int num = 225;

        double root = Math.sqrt(num);

        if (root == Math.floor(root)) {

            System.out.println("Number is Perfect square ....");


        } else {
            System.out.println("Number is not perfect square....");
        }
    }
}