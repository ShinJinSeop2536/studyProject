package org.example.java.lambda.chapter5;

public class UsingThis {
    public int outtherfield = 10;

    class Inner{
        int innerField =20;
        void method(){
            MyFunctionalInterface fi = () -> {
                System.out.println("OuterterField:"+outtherfield);
                //바깥 객체의 참조를 얻기 위해서 클래스명의.this를 사용
                System.out.println("OuterterField:"+UsingThis.this.outtherfield);
                System.out.println("InnerField:"+innerField);
                //람다식 내부에서 this는 inner 객체를 사용한다.
                System.out.println("InnerField:"+this.innerField);
            };
            fi.method();
        }
    }
}
