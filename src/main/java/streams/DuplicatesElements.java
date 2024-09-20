package streams;

//Given a stream containing some elements, the task is to find the duplicate elements in this stream in Java.
//
//        Examples:
//
//Input: Stream = {5, 13, 4, 21, 13, 27, 2, 59, 59, 34}
//Output: [59, 13]

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesElements {
    public static void main(String[] args) {
        List <Integer> elements=new ArrayList<>(Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34));

        Set<Integer> elementWithoutDuplicates=new HashSet<>();

        List<Integer> duplicates = elements.stream()
                .filter(n -> !elementWithoutDuplicates.add(n)).
                collect(Collectors.toList());
        System.out.println(duplicates);
        Set<Integer> collect = elements.stream().collect(Collectors.toSet());


        List<Integer> collect1 = elements.stream().distinct().collect(Collectors.toList());
        System.out.println(collect1+"......................");
        System.out.println(collect+">>>>>>>>>>>>>>>>>>>");
    }
}
