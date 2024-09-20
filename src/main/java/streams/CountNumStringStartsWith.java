package streams;
//5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountNumStringStartsWith {
    public static void main(String[] args) {
        String[] arr = {"Red", "Green", "Blue", "Pink", "Brown"};
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        char startWith = 'B';

        List<String> collect = colors.stream().filter(c -> c.startsWith(String.valueOf(startWith))).collect(Collectors.toList());
        System.out.println(collect);
        for (String str : arr) {
            char[] charArray = str.toCharArray();
            if (charArray[0] == startWith) {
                System.out.println(str);
            }
        }
    }
}
