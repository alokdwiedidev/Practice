package org.example.basic;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 25;
        int fibnc=1;
        List  fibonacciSeries=new ArrayList<>();

        for (int i =0; i<=num;i++){
             fibnc=i+fibnc;

         fibonacciSeries.add(fibnc);
        }
        System.out.println(fibonacciSeries);
    }

}
