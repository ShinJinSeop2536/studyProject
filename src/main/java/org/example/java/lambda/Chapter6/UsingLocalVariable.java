package org.example.java.lambda.Chapter6;

import org.example.java.lambda.chapter5.MyFunctionalInterface;

public class UsingLocalVariable {
    void method(int arg){ //arg는 final 특성을 가짐
        int localVar = 10;

        //arg=10;           //finsl 특성을 가짐 수정불가
        //localVar =42;     //finsl 특성을 가짐 수정불가
        MyFunctionalInterface fi = () ->{

            //로컬 변수
            System.out.println("arg:"+ arg);
            System.out.println("localVar:"+localVar);
        };
        fi.method();

    }

}
