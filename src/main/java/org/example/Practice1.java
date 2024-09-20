package org.example;
//For the given array of integers, count even and odd elements.
//int arr[5] = {2, 3, 4, 5, 6}


public class Practice1 {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 6, 8, 9, 3, 8, 7};
        int evenCount = 0;
        int oddcount = 0;
        System.out.println("even numbers are :");

        for (int x : arr) {

            if (x % 2 == 0) {
                evenCount++;
                System.out.println(x + " ");

            }
        }
        System.out.println("odd numbers are :");
        for (int y : arr)
            if (y % 2 != 0) {
                oddcount++;
                System.out.println(y + " ");

            }

        System.out.println("the given array has :" + evenCount + " even numbers");
        System.out.println("the given array has :" + oddcount + " oddnumbers");
    }

}
