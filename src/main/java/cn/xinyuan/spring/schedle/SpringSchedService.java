package cn.xinyuan.spring.schedle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User:josli li
 * Date:17/8/30
 * Time:上午9:39
 * Mail:josli@kargocard.com
 */

@Component
public class SpringSchedService {
    private static final Logger log = LoggerFactory.getLogger(SpringSchedService.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
    @Scheduled(cron="0/10 * *  * * ? ")
    public void task(){
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
