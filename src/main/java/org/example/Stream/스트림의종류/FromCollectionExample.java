package org.example.java.Stream.스트림의종류;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동",95),
                new Student("신진섭",100),
                new Student("유승준",20)
        );
        Stream<Student> stream = list.stream();
        stream.forEach(student -> {
            System.out.println("이름:"+ student.getName()+"점수:"+ student.getScore());
        });

    }
}
