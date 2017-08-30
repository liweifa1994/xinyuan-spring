package cn.xinyuan.spring.schedle.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;

/**
 * User:josli li
 * Date:17/8/30
 * Time:上午9:48
 * Mail:josli@kargocard.com
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath:spring/applicationContext-service.xml")
public class SpringTest {

    @Test
    public void testT1(){
        boolean flag = true;
        while (flag){
            try {
                TimeUnit.SECONDS.sleep(60);
                flag = false;
            }catch (Exception e){

            }
        }
        
    }

}
