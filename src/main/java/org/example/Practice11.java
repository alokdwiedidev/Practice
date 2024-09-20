package org.example;
// sum of numbers
public class Practice11 {
    public static void main(String[] args) {
        int a =4689;
        int sum=0;
       while (a!=0){
           sum=sum+a%10;
           a/=10;
       }
        System.out.println(sum);
    }
}
