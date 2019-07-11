package com.huobanbengkui.common;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

//定时任务

@Component
public class SchedulTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//    会自动执行   http://cron.qqe2.com/
//    @Scheduled(fixedRate = 3000)
    @Scheduled(cron = "4-40 * * * * ?")
    public  void reportCurrentTime() {
        System.out.println("现在的时间: " + dateFormat.format(new Date()));
    }

}
