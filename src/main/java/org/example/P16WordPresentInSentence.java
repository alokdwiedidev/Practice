package org.example;

//Input: str = “Geeks for Geeks”, word = “Geeks”
//Check if a word is present in a sentence
public class P16WordPresentInSentence {
    public static void main(String[] args) {
        String str = "Geeks for Geeks";
        String word = "Geeks";
        String[] splittedStr = str.split(" ");
        int stringPresent = 0;
        for (String str1 : splittedStr) {
            for (int i = 0; i <= splittedStr.length; i++) {
                if (str1.equals(word)) {
                    stringPresent++;
                }
            }
        }
        if (stringPresent != 0) {
            System.out.println("Word Is present" + stringPresent + "      times");
        } else System.out.println("Word is not present");
    }
}
