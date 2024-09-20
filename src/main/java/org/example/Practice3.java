package org.example;
//Input: N = 1234
//Output: One Two Three Four
//Explanation:
//Every digit of the given number has been converted into its corresponding word.

public class Practice3 {
    public static void main(String[] args) {
        int num=10894;
        String numStr= String.valueOf(num);

        for (char str: numStr.toCharArray()){
            switch (str){
                case '1':
                    System.out.print("ONE ");
                break;
                case '2':
                    System.out.print("TWO ");
                    break;
                case '3':
                    System.out.print("THREE ");
                    break;
                case '4':
                    System.out.print("FOUR ");
                    break;
                case '5':
                    System.out.print("FIVE ");
                    break;
                case '6':
                    System.out.print("SIX ");
                    break;
                case '7':
                    System.out.print("SEVEN ");
                    break;
                case '8':
                    System.out.print("EIGHT ");
                    break;
                case '9':
                    System.out.print("NINE ");
                    break;
                case '0':
                    System.out.print("ZERO ");
            break;
                default:

            }
        }
    }
}
