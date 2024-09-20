package demo;

import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largestNum = 0;


        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            if (num > largestNum) {
                largestNum = num;
            }
        }
        System.out.println("largest number " + largestNum);
    }
}
