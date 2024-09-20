package org.example.basic;

public class FactorialOfNum {

    public static void main(String[] args) {
        int num = 4;

        for (int i= num-1;i>=1;i--){
            num=num*i;
        }
        System.out.println( num);
    }
}
