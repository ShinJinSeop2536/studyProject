package org.example.java.lambda.chapter8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSample {

        private static List<Student> list = Arrays.asList(
                new Student("홍길동","남자",90),
                new Student("장윤진","여자",90),
                new Student("곽현철","남자",90),
                new Student("박한나","남자",90)
        );
    public static  double avg(Predicate<Student> predicate){
        int count = 0, sum = 0;
        for(Student student :list){
            if(predicate.test(student)){
                count++;
                sum += student.getAge();
            }
        }
        return  (double)sum/count;
    }

    public static void main(String[] args) {
        double maleAge =avg(t -> t.getSex().equals("남자") );
        System.out.println("남자 평균 점수:"+ maleAge);

        double femaleAge =avg(t -> t.getSex().equals("여자") );
        System.out.println("여자 평균 점수:"+ femaleAge);
    }
}
