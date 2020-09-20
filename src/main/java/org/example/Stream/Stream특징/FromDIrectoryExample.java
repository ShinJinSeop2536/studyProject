package org.example.java.Stream.Stream특징;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDIrectoryExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:/");
        Stream<Path> stream = Files.list(path);
        stream.forEach(p-> System.out.println(p.getFileName()));
    }
}
