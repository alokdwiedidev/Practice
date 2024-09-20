package org.example.newPackege;

import java.util.Arrays;

//Write a Java program that partitions an array of integers into even and odd numbers.
//
//Expected Output
//
//Original array: [7, 2, 4, 1, 3, 5, 6, 8, 2, 10]
//After partition the said array becomes: [10, 2, 4, 2, 8, 6, 5, 3, 1, 7]
public class EvenOddArrayPartition {
    public static void main(String[] args) {
        int arr[] = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
        int numIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

                arr[numIndex] = arr[i];
                int temp = arr[numIndex];
                arr[i] = temp;
                numIndex++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

