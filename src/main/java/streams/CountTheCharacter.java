package streams;


//Count occurrence of a given character in a string using Stream API in Java
//Given a string and a character, the task is to make a function which counts the occurrence of the given character in the string using Stream API.
//
//Input: str = "geeksforgeeks", c = 'e'
//Output: 4

import java.util.HashMap;
import java.util.Map;

public class CountTheCharacter {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        char c='e';


        int count =0;
        char[] charArray = str.toCharArray();
        for (int i =0 ;i<charArray.length;i++){
            if (charArray[i]==c){
                count++;
            }
        }

//        long count1=  str.chars().filter(ch-> ch==c).count();
        System.out.println( count+" counts str have");
    }

}
