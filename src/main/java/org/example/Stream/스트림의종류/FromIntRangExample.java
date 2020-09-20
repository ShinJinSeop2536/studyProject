package org.example.java.Stream.스트림의종류;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FromIntRangExample {
    public  static int sum;
    public static void main(String[] args) {
        //range = 두번째 매개값을 표함하지 않는다
        IntStream intStream = IntStream.range(1,100);
        intStream.forEach(a->sum+=a);
        System.out.println("총합:"+sum);

        System.out.println();
        sum=0;
        //rangeClosed = 두번쨰 매개값을 표함한다.
        IntStream stream = IntStream.rangeClosed(1,100);
        stream.forEach(a->sum+=a);
        System.out.println("총합:"+sum);
    }
}
