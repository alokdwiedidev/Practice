package org.example.basic;

public class NumberOfEvenAndOddDigit {
    public static void main(String[] args) {

        int num= 1457895725;
        int evenNum=0;
        int oddNum=0;
        while(num!=0){
            int digit=num%10;
            num/=10;
            if (digit%2==0){
                System.out.println("EVEN NUM.. "+digit);
                evenNum++;

            }else{ System.out.println("ODD  NUM.. "+digit);
               oddNum++;
        }}
        System.out.println( "the number  "+ num +"have "+evenNum +" Even NUMBERS and "+oddNum+" ODD NUMBERS");
    }
}
