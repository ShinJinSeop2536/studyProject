package org.example.java.lambda.chapter7;

public class Main {
    public static void main(String[] args) {
        //자바에서 제공하는 표쥰APi를 람다식으로 표현 가능 하다
        Runnable runnable = () -> {
                for(int i =0; i<10; i++){
                    System.out.println(i);
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
    }

}
