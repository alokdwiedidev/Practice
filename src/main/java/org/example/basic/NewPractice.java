package org.example.basic;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

//Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.
public class NewPractice {
    public static void main(String[] args) {


        int arr[] = {1, 4, 17, 7, 25, 3, 100};
        List<Integer>numList=Arrays.asList(1, 4, 17, 7, 25, 3, 100);
        int kth = 4;
        Arrays.sort(arr);
        System.out.println("printing the kth largest number .....");

        OptionalDouble average = numList.stream().mapToInt(Integer::intValue).average();
//        numList.stream().filter(n-> n > average).forEach(System.out::println);


        for (int i = arr.length - 1; i >= kth; i--) {

            System.out.println(arr[i]);


        }
// for smallest number

        System.out.println("printing the kth smallest number .....");
        for (int i=0;i<kth;i++){
            System.out.println(arr[i]);
        }
    }

}
