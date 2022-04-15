package com.xin.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class, args);
        System.out.println("hello ,get !");
        System.out.println("my hot_fix");
        System.out.println("master test!");
    }

}
