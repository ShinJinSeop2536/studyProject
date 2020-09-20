package org.example.java.Stream.스트림파이프라인;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> inputList1 = Arrays.asList("java* lambda","Stream mapping");
        inputList1.stream()
                .flatMap(data->Arrays.stream(data.split(" ")))
                .forEach(word-> System.out.println(word));

        List<String> inputList2 = Arrays.asList("10","20","30","40","50","60");
//        inputList2.stream()
//                .flatMap(data->{
//                    String[] strArr = data.split(",");
//                    int[] intArr = new int[strArr.length];
//                    for(int i = 0; i<strArr.length; i++ ){
//                        intArr[i] = Integer.parseInt(strArr[i].trim());
//                    }
//                    return Arrays.stream(intArr);
//                })
//                .forEach(n-> System.out.println(n));

    }
}
