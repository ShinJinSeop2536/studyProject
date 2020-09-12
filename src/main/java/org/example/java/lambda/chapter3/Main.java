package org.example.java.lambda.chapter3;

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface f1;
        f1 =(x) -> {
          int resual  = x*5;
            System.out.println(resual);
        };
        f1.Method(2);
    }
}
