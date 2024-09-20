package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find Second largest element in an array
public class P17SecondLargestElementInArray {
    public static void main(String[] args) {

        int arr[] = {10, 45, 21, 72, 14, 16, 18, 19, 54};

        int secondLargest = 0;
        int firstLargest = 0;

        List<Integer> sortedarray = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        sortedarray.get(1);
        int seconf = sortedarray.get(arr.length - 2);
        System.out.println(seconf + "::::::::::::::::");

        for (int num : arr) {
            if (num > firstLargest) {
                firstLargest = secondLargest;
                firstLargest = num;

            } else if (num > secondLargest && num < firstLargest) {
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);
    }
}


