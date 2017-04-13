package com.ifunq.sfht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SfhtOverseaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfhtOverseaApplication.class, args);
    }
}
