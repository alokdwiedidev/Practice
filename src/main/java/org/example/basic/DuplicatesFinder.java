package org.example.basic;

public class DuplicatesFinder {
    public static void main(String[] args) {
        int [] arr= {5, 13, 4, 21, 13, 27, 2, 59, 59, 34};

        System.out.println("Duplicates....");

        for (int i=0;i< arr.length;i++){
            for ( int j= i+1;j< arr.length;j++){
                if (arr[i]==arr[j]) {
                    System.out.println( arr[i]);
                }
            }
        }
    }
}
