package org.example.java.lambda.chapter8;

import java.util.function.Supplier;

public class SuppLierSample {
    public static void main(String[] args) {
        Supplier<String> supplier = () ->{
            return "시진섭";
        };
        System.out.println(supplier.get());
    }
}
