package org.example;
//Given a string, count the total number of vowels (a, e, i, o, u) in it.


public class Practice8 {
    public static void main(String[] args) {
        String name = "geksforgeeks portal";
        name.toLowerCase();

        int vowelCount = 0;
//        for (char c:name.toCharArray()){
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("there are " + vowelCount + " vovels  in name  " + name);
    }
}
