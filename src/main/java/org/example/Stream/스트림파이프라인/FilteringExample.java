package org.example.java.Stream.스트림파이프라인;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동","신용권","기아름","홍길동");
        names.stream()
                //중복제거
                .distinct()
                .forEach(n-> System.out.println(n));
        names.stream()
                //필터링
                .filter(n->n.startsWith("신"))
                .forEach(n-> System.out.println(n));
        names.stream()
                .distinct()
                .filter(n->n.startsWith("신"))
                .forEach(n-> System.out.println(n));

    }

}
