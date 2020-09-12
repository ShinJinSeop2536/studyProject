package org.example.java.lambda.chapter1;

public class Main {
    public static void main(String[] args) {
        //익명 구현체
        Runnable run =  new Runnable() {
            @Override
            public void run() {

            }
        };
        //람다식
        Runnable run2 = () -> {
            int num =10;
            System.out.println(num);
        };
        run2.run();
    }
}
