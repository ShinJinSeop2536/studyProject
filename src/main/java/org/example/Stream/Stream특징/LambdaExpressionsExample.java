package org.example.java.Stream.Stream특징;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동",100),
                new Student("신진섭",80)
        );

        Stream<Student> stream = list.stream();
        //함수적 인터페이스
        //매개 타입을 가지고 있다
        stream.forEach(s -> {
            String name = s.getName();
            int score =s.getScore();
            System.out.println("이름:"+name+"점수"+score);
        });
    }
}
