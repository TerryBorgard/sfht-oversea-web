package com.ifunq.sfht.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Description:
 * Created by yanghua on 2017/4/7.
 */
@Component
public class AutoTask2 {
    @Scheduled(fixedRate = 150000)
    public void execute() {
        System.out.println("开始执行定时任务222");
    }
}
