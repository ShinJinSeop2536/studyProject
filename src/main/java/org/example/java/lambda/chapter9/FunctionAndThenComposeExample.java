package org.example.java.lambda.chapter9;

import java.util.function.Function;

public class FunctionAndThenComposeExample {
    public static void main(String[] args) {
        Function<Member,Address >functionA;
        Function<Address,String>functionB;
        Function<Member, String>functionC;
        Function<Member, String>functionAB;
        String city;

        functionA = (m) -> m.getAddress();
        functionB = (m) -> m.getCity();

        functionAB = functionA.andThen(functionB);
        city = functionAB.apply(
                new Member("홍길동","hong", new Address("한국","성울"))
        );
        System.out.println("거주도시:"+city);


        functionAB = functionB.compose(functionA);
        city = functionAB.apply(
                new Member("홍길동","hong", new Address("한국","성울"))
        );
        System.out.println("거주도시:"+city);

    }
}
