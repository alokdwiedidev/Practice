package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Given a stream containing some elements, the task is to get the first element of the Stream in Java.
//Input: Stream = {“Geek_First”, “Geek_2”, “Geek_3”, “Geek_4”, “Geek_Last”}
//Output: Geek_First
public class StreamsBasic {
    public static void main(String[] args) {
        List<String>wordList=new ArrayList<>(Arrays.asList("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last"));


        Optional<String> first = wordList.stream().findFirst();
        Optional<String> last = wordList.stream().findAny();
        System.out.println(first);
        System.out.println(last);
    }
}