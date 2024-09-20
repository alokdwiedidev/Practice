package streams;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> numList= Arrays.asList(12,13,14,15,16,18,20,8,7);
      int evenSum=  numList.stream().filter(n-> n%2==0).mapToInt(Integer::intValue).sum();
      int oddSum= numList.stream().filter(n-> n%2!=0).mapToInt(Integer::intValue).sum();

        System.out.println( evenSum);
        System.out.println( oddSum);
    }
}
