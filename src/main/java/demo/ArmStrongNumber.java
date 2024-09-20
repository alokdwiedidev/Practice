package demo;
// take the digit if the sum of cube of digit == number
public class ArmStrongNumber {

    public static void main(String[] args) {
        int num= 1535;
        int temp=num;
        int sumOfCubeOfDigit=0;

        while (temp!=0){
            int digit= temp%10;

            int cube=digit *digit*digit;
            sumOfCubeOfDigit+=cube;

            temp/=10;

        }
        if (num==sumOfCubeOfDigit){
            System.out.println(" the number is amstrong");
        }else System.out.println(" the number is not amstrong");

    }


}
