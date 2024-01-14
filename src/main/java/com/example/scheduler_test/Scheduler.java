package com.example.scheduler_test;



import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;


@Component
public class Scheduler {

    @Scheduled(cron = "0 * * * * *")
    public void schedulerTestCron() {
        LocalTime now = LocalTime.now();
        System.out.println(
                "schedule tasks using cron jobs - " + now);

    }
}
