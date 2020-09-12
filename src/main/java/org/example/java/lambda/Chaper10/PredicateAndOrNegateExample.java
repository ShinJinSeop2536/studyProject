package org.example.java.lambda.Chaper10;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
    public static void main(String[] args) {
        //2의 배수 검사
        IntPredicate intPredicateA  = a-> a%2==0;
        //3의 배수 검사
        IntPredicate intPredicateB  = a-> a%3==0;

        IntPredicate intPredicateAB;

        boolean result;

        //and==&&
        intPredicateAB = intPredicateA.and(intPredicateB);
        result = intPredicateAB.test(9);

        //and == ||
        intPredicateAB = intPredicateA.or(intPredicateB);
        result = intPredicateAB.test(9);

        //and ==!
        intPredicateAB = intPredicateA.negate();
        result = intPredicateAB.test(9);

    }
}
