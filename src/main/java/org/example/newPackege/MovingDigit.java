package org.example.newPackege;

import java.util.Arrays;

//Write a Java program to move every zero to the right side of a given array of integers.
//
//Original array: [0, 3, 4, 0, 1, 2, 5, 0]
//Result: [3, 4, 1, 2, 5, 0, 0, 0]
public class MovingDigit {
    public static void main(String[] args) {
        int arr[] = {0, 3, 4, 0, 1, 2, 5, 0};
       int nonZeroIndex=0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0) {
            arr[nonZeroIndex]=arr[i];
            nonZeroIndex++;

            }
            }while (nonZeroIndex<arr.length){
            arr[nonZeroIndex++]=0;
            }   System.out.println(Arrays.toString(arr));

    }
}
