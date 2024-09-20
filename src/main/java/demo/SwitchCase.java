package demo;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("ENTER A FROUT NAME.....");
            String froutName = sc.nextLine();

            switch (froutName) {
//                case "Apple":
//                    System.out.println("one apple a day keeps the doctor away");
//                    break;
//                case "Mango":
//                    System.out.println("it is the king of frouts");
//                    break;
//                case "Banana":
//                    System.out.println(" it provide instant energy");
//                    break;
//                default:
//                    System.out.println("good frout");

                case "Apple"-> System.out.println("one apple a day keeps the doctor away");
                case "Mango"->System.out.println("it is the king of frouts");
                case "Banana"->System.out.println(" it provide instant energy");
                default -> System.out.println("good frout");
            }
        }
    }
}
