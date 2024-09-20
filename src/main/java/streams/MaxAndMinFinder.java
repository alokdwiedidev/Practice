package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//7. Write a Java program to find the maximum and minimum values in a list of integers using streams.
public class MaxAndMinFinder {
    public static void main(String[] args) {
        List <Integer> listNum=new ArrayList<>();
        listNum.add(12);
        listNum.add(20);
        listNum.add(38);
        listNum.add(78);
        listNum.add(8);
        listNum.add(89);
        listNum.add(4);

        Optional<Integer> max = listNum.stream().max(Integer::compareTo);
        Optional<Integer> min = listNum.stream().min((a,b)->a.compareTo(b));
        System.out.println(max);
        System.out.println(min);

    }
}
