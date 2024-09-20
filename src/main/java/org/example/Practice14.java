package org.example;

//Program to check if an array is sorted or not
public class Practice14 {

    private static boolean isArraySorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr = {10, 12, 16, 18, 25, 28, 34};
        if (isArraySorted(arr)) {
            System.out.println("array is sorted");
        } else
            System.out.println("array is not sorted");
    }
}