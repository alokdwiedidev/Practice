package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

//Write a Java program to calculate the average of a list of integers using stream
public class AverageOfList {
    public static void main(String[] args) {
        List <Integer> numList=new ArrayList<>();

        numList.add(10);
        numList.add(15);
        numList.add(20);
        numList.add(25);
        numList.add(30);
        numList.add(35);
        numList.add(40);

        OptionalDouble average = numList.stream().mapToInt(Integer::intValue).average();
        System.out.println(average);

    }
}
