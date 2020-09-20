package org.example.java.Stream.스트림파이프라인;

import java.util.Arrays;
import java.util.List;

public class StreamPipLinesExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동",Member.FEMALE,20),
                new Member("변신",Member.MALE,30),
                new Member("오징어",Member.FEMALE,15)
        );
        double ageAvg = list.stream()
                        .filter(m->m.getSex()==Member.FEMALE)//중간단계
                        .mapToInt(Member::getAge)//중간단계
                        .average()//최종단계
                        .getAsDouble();

        System.out.println("평균:"+ ageAvg);


    }
}
