package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.


public class UpperLowerCases {
    public static void main(String[] args) {


    List<String> srtList= Arrays.asList("Alok","Shivam","ajeet","ABhishek","ashOk");

        List<String> collect = srtList.stream().map(String::toLowerCase).collect(Collectors.toList());
        List<String> collect1 = srtList.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(collect);
        System.out.println(collect1);
    }}
