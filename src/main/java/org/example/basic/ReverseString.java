package org.example.basic;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Hello alok how are you";
//        StringBuilder sb = new StringBuilder(str);
//        String reverse = sb.reverse().toString();
        String reverse="";
            for (int i=str.length()-1;i>=0;i--){

               reverse+= str.charAt(i);

            }
        System.out.println(reverse);

        System.out.println("reverseStr..........   "  +reverse);
    }
    }
