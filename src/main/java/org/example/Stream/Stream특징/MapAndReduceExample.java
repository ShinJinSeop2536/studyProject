package org.example.java.Stream.Stream특징;

import org.example.java.Stream.Stream특징.Student;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동",80),
                new Student("멍철이",100),
                new Student("신진섭",78),
                new Student("병신",30)
        );
        double avg = list.stream()
        //중가처리(학생 객체를 점수로 매핑)
        .mapToInt(Student::getScore)
        //최종처리(평균점수)
        .average()
        .getAsDouble();

        System.out.println("평균점수:"+avg);
    }
}
