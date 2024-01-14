package com.example.scheduler_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@SpringBootApplication
public class SchedulerTestApplication {



    public static void main(String[] args) {
        SpringApplication.run(SchedulerTestApplication.class, args);
    }

}
