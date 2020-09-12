package org.example.java.lambda.chapter8;

import java.util.function.IntBinaryOperator;

public class OperatorEXample {
    private static int[] scores ={92, 95,87};
    public static int maxOrMin(IntBinaryOperator operator){
        int result = scores[0];
        for(int sorce : scores){
            result = operator.applyAsInt(result,sorce);
        }
        return result;
    }
    public static void main(String[] args) {
        int max = maxOrMin(
            (a, b)->{
                if(a>=b)return a;
                else return  b;
            }
        );
        System.out.println("최대값:"+max);
        int min = maxOrMin(
                (a, b)->{
                    if(a<=b)return a;
                    else return  b;
                }
        );
        System.out.println("최소값:"+max);
    }
}
