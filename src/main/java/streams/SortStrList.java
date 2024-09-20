package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams
public class SortStrList {

    public static void main(String[] args) {
        List<String>strList= Arrays.asList("Alok","Ashish", "Ritik","Ashok","Nikhil","Jishan");

        List<String> collect = strList.stream().sorted().collect(Collectors.toList());
        List<String> collect2 = strList.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect2);
    }
}
