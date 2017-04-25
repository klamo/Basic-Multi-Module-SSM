package com.youmeek.ssm.manage.controller;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by klamo on 2017/4/25.
 */
@Component("jobClass")
public class JobClass {
    /*
     spring的task定时任务设置
        http://blog.csdn.net/prisonbreak_/article/details/49180307
        http://gong1208.iteye.com/blog/1773177
     */

    @Scheduled(fixedRate = 5000)
    public void doJob() {
        System.out.println("不继承QuartzJobBean方式-调度进行中...");
    }
}