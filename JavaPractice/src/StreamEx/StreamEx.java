package StreamEx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Stream", "Api", "Study", "And", "Test" );

        list.stream().forEach(System.out::println);

        list.stream()
                .filter( s -> s.startsWith("J"))
                .forEach(System.out::println);
        list.stream()
                .map(String::toUpperCase) //.map(s->s.toUpperCase()) 와 같은 기능
                .forEach(System.out::println);
        
        
        // 리스트에 문자열 길이 합 계산
        int totalLength = list.stream()
        		.mapToInt(String::length)
        		.sum();
        System.out.println("list 문자의 전체 길이:" + totalLength);

    }
}
