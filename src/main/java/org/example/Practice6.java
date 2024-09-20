package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largestNum = 0;
        List<Integer> numList = new ArrayList<>();

        while (true) {
            System.out.println("enter the number.....");
            int number = sc.nextInt();


            if (number == -1) {
                break;
            }

            numList.add(number);

        }

        OptionalInt maxNumInList = numList.stream().mapToInt(Integer::intValue).max();
        System.out.println("THE LARGESR NUMBER AMONG ALL NUMBERS YOU ENTERED IS ..............." + maxNumInList);
    }
}