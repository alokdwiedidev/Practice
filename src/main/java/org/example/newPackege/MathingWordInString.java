package org.example.newPackege;

//Write a Java program to accept two strings and test if the second string contains the first one.
//
//Input first string: Once in a blue moon
//Input second string: See eye to eye
//If the second string contains the first one? false
public class MathingWordInString {
    public static void main(String[] args) {

        String str1 = "Once in a blue moon";
        String str2 = "See eye to eye ";
        String[] words1 = str1.split(" ");
        String[] words2 = str2.split(" ");
        boolean haveMatchingCharacter = false;
        for (int i = 0; i < words1.length; i++) {
            for (int j = 0; j < words2.length; j++) {
                if (words1[i].equals(words2[j])) {
                    System.out.println(words1 + "........." + words2);
                    haveMatchingCharacter = true;
                }
            }

        }
        System.out.println(" having matching character......" + haveMatchingCharacter);
    }

}

