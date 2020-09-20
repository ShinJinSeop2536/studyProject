package org.example.java.Stream.Stream특징;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {
    public static void main(String[] args) throws IOException {
        //파일의 경로 정보를 가지고 있는 Path객체 생성
        Path path = Paths.get("");
        Stream<String> stream;

        //Files.lines() 매소드 이용
        //Charset.defaultCharset()
        //운영체제의 기본 문자셋
        stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out::println);
        System.out.println();

        //BufferedReader의 lines() 메소드 이용
        BufferedReader br  =  new BufferedReader(new FileReader(path.toFile()));
        stream = br.lines();
        stream.forEach(System.out::println);
    }
}
