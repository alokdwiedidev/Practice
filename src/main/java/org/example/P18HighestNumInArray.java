package org.example;
//HighestNumInArray
public class P18HighestNumInArray {
    public static void main(String[] args) {


        int arr[] = {10, 45, 21, 72, 14, 16, 18, 19, 54};

        int highestNum = 0;
        for (int num : arr) {
            if (num < highestNum) {

            } else highestNum = num;
        }
        System.out.println(highestNum);
    }}
