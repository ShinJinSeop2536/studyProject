package org.example.java.lambda.chapter4;

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface fi;
        fi =(x,y)->{
          return x+y;
        };
        System.out.println(fi.method(5,4));
        fi =(x,y)->x+y;
        System.out.println(fi.method(5,4));
        //MyFunctionalInterface fi = (x,y) -> {....,retrun 값}
        //{}안에 retrun문만 있고, return문 뒤에 연산식이나 메소드 호출이 오는 경우
        fi = (x,y) ->Sum(x,y);
        System.out.println(fi.method(5,4));

    }
    public static int Sum(int x, int y){
        return x+y;
    }
}
