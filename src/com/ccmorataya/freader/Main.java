package com.ccmorataya.freader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir") + "\\1.pdf");
        Path path = Paths.get(System.getProperty("user.dir") + "/1.pdf");
        try {
            byte[] bytes = Files.readAllBytes(path);

            System.out.println(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
