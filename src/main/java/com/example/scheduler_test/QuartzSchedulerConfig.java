package com.example.scheduler_test;



import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzSchedulerConfig {

    // @Bean : 메서드가 반환하는 객체를 빈으로 등록하는 어노테이션
    @Bean
    public JobDetail myScheduledJobDetail() {
        return JobBuilder.newJob(MyScheduledJob.class)
                .withIdentity("myScheduledJob")
                .storeDurably()
                .build();
    }


    @Bean
    public Trigger mySecheduledJobTrigger() {
        return TriggerBuilder.newTrigger()
                .forJob(myScheduledJobDetail())
                .withIdentity("myScheduledJobTrigger")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 * * * * ?"))
                .build();
    }
}
