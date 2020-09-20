package org.example.java.Stream.스트림의종류;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
    public static void main(String[] args) {
        String[] strArray ={"홍길동","신진섭","말보로"};
        Stream<String> stream = Arrays.stream(strArray);
        stream.forEach(a-> System.out.println(a+","));

        System.out.println();

        int[] intArray = {80,95,100};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(a-> System.out.println(a+','));
    }
}
