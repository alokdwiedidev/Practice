package org.example.basic;
//Write a Java program to count letters, spaces, numbers and other characters in an input string.
//Expected Output
//
//The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33

public class CountLettersNumbersSpacesInSentence {
    public static void main(String[] args) {

int letters=0;
int spaces=0;
int numbers=0;
int others=0;

        String str = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        for (char c:str.toCharArray()){
            if (Character.isLetter(c)){
                letters++;
            } else if (Character.isDigit(c)) {
                numbers++;


            } else if (Character.isWhitespace(c)) {
                spaces++;

            } else {
                others++;
            }
        }
        System.out.println( " the given String have " +letters+" letters");
        System.out.println( " the given String have " +numbers+" numbers");
        System.out.println( " the given String have " +spaces+" spaces");
        System.out.println( " the given String have " +others+" others");
    }
}
