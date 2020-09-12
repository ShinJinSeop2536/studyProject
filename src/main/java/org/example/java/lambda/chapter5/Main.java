package org.example.java.lambda.chapter5;

public class Main {
    static  int num =10;
    public static void main(String[] args) {
        UsingThis.Inner inner = new UsingThis().new Inner();
        inner.method();

    }
}
