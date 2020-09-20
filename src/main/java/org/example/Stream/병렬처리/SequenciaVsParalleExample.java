package org.example.java.Stream.병렬처리;

import java.util.Arrays;
import java.util.List;

public class SequenciaVsParalleExample {
    //요소처리
    public static void work(int value){
        try {
            //값이 적을수록 순차차리가 빠름
            Thread.sleep(100);
        }catch (InterruptedException e){

        }
    }
    //순가처리
    public static long testSquencial(List<Integer>list) {
        long start = System.nanoTime();
        list.stream().forEach(a->work(a));
        long end = System.nanoTime();
        long runTime = end -start;
        return runTime;
    }
    //병렬처리
//    public static long testParallel(List<Integer>list) {
//        long start = System.nanoTime();
//        list.stream().parallel(a->work(a));
//        long end = System.nanoTime();
//        long runTime = end -start;
//        return runTime;
//    }
    public static void main(String[] args) {
        //소스 컬렉션
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        //순처 스트림 처리 시간 구하기
        long timeSequencial = testSquencial(list);

        //병렬처리 스트림 처리 시간 구하기
//        long timeParallel = testParallel(list);



    }
}
