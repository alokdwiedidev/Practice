package demo;

import java.util.Scanner;

public class LagestNum2F {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largestNum = 0;
        int num;
        do {
            num = sc.nextInt();
            if (num > largestNum && num != -1) {
                largestNum = num;
            }
        }

        while (num == -1);
        System.out.println("largest number " + largestNum);
    }
}

