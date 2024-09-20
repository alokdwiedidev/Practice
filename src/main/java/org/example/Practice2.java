package org.example;
//Given an array, the task is to find average of that array. Average is the sum of array
//elements divided by the number of elements

public class Practice2 {
    public static void main(String[] args) {
        int []arr = {55,55,55};
        int sum=0;
        for (int x:arr){
          sum = sum + x;
        }
        int average= sum/ arr.length;
        System.out.println("the Average of given numbers is :"+average);
    }
}
