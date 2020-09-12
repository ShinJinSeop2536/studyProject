package org.example.java.lambda.chapter2;

//두개 이상의 추상메소드 컴파일러가 Checking 오노테이션
@FunctionalInterface
public interface MyFunctionalInterFace {
    public void Method();
    //public void otherMethod(); // 컴파일 오류
    //람다식이 하나의 메소드를 정의한다.
    //하나의 추상 메소드가 선언되 인터페이스만이 람다식의 타켓 타입
    //-> 함수적 인터페이스
}
