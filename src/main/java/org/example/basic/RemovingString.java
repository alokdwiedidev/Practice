package org.example.basic;

public class RemovingString {
    public static void main(String[] args) {
        String str="Alok";

        int middleString=str.length()/2;
        System.out.println(middleString+   "    middleString");

        String halfString=str.substring(0,middleString);
        System.out.println( halfString+"    halfString");

    }
}

