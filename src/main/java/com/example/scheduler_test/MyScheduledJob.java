package com.example.scheduler_test;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.time.LocalTime;

public class MyScheduledJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        LocalTime now = LocalTime.now();
        System.out.println("quartz - " + now);
    }
}
