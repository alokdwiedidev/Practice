package org.example.basic;
//Write a Java program to insert a word in the middle of another string.
//Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python Tutorial 3.0.
public class MiddleStringInsertion {
    public static void main(String[] args) {
        String str= "Python 3.0";
        String wordAdition="Tutorial";

        String [] splitedStr=str.split(" ",2);
        System.out.println(splitedStr+"        splitedStr");

//        String resultString1=splitedStr[0]+wordAdition+splitedStr[1];
int middleIndex=str.indexOf(' ')+1;//        System.out.println(resultString1+"       resultString1");
        System.out.println(middleIndex+"       middleIndex");
        String resultString=str.substring(0,middleIndex)+wordAdition+str.substring(middleIndex);
        System.out.println(resultString);

    }
}
