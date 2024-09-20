package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        List<Integer> numList= Arrays.asList(10,12,15,48,75,13,16,46,12,32);

        List<Integer> collect = numList.stream().sorted().distinct().collect(Collectors.toList());
        Integer secondSmallest = collect.get(1);
        Integer secondLargest = collect.get(collect.size() - 2);

        System.out.println(secondLargest);
        System.out.println(secondSmallest);

    }
}
