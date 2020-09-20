package org.example.java.Stream.Stream특징;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "홍길동", "신진섭", "철수", "영희", "가나다"
        );
        //순간처리
        Stream<String>stream = list.stream();
        stream.forEach(ParallelExample ::print);

        System.out.println();

        //병렬처리
        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExample::print);
    }
    public static void print(String str){
        System.out.println(str+":"+Thread.currentThread().getName());
    }
}
