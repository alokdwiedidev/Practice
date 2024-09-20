package org.example.basic;

//39. Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit
// numbers are there.

public class ThreeDigitNumberCreater {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {

                    int uniqueNumber = i * 100 + j * 10 + k;

                    count++;
                    System.out.println(" The uqique Numbers is  ........................." + uniqueNumber);
                }
            }
        }
        System.out.println(">>>>>>>>>>>>>"+System.currentTimeMillis());

        System.out.println(" Their are " + count + " uqique Numbers");
    }
}
