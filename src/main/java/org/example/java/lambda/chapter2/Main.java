package org.example.java.lambda.chapter2;

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterFace f1;
        f1 = ()->{
            String name = "shrnjinxie";
            System.out.println(name);
        };
        f1.Method();

        f1 = ()->{System.out.println("신진섭"); };
        f1.Method();
        
        //실행 메소드가 하나이면 {} 생략 가능
        f1 = ()->System.out.println("잘생김");
        
        f1.Method();

    }
}
