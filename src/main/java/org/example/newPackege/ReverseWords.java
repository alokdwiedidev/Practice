package org.example.newPackege;

// Write a Java program to reverse a sentence (assume a single space between two words) without reverse every word.
//
//Input a string: The quick brown fox jumps over the lazy dog
//Result: dog lazy the over jumps fox brown quick The
public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String[] words = sentence.split(" ");

        StringBuilder reverseStr = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reverseStr.append(words[i]);
            if (i != 0) {
                reverseStr.append(" ");
            }
        }
        System.out.println(reverseStr);
    }
}
