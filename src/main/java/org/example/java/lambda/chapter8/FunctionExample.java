package org.example.java.lambda.chapter8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionExample {
    private static List<Student> list = Arrays.asList(
            new Student("신진섭",18,5.5),
            new Student("신진섭",18,5.5)
    );
    public static void prinString(Function<Student, String> function){
        for (Student st : list)
        {
            System.out.println(function.apply(st));
        }
        System.out.println();
    }
    public static void prinInt(ToIntFunction<Student> function){
        for (Student st : list)
        {
            System.out.println(function.applyAsInt(st));
        }
        System.out.println();
    }
    public static void prinDouble(ToDoubleFunction<Student> function){
        for (Student st : list)
        {
            System.out.println(function.applyAsDouble(st));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        prinString(t->t.getName());
        prinInt(t->t.getAge());
        prinDouble(t->t.getDd());
    }
}
