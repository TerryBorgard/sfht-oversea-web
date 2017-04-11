package com.ifunq.sfht.common.books.effective_java.create_destroy_obj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * R2
 * Created by  Yanghua on
 * Date：2017/4/5 Time：20:46
 * Description: 避免创建不必要的对象
 */
public class EffectiveJavaR5 {
    private static final Logger logger = LoggerFactory.getLogger(EffectiveJavaR5.class);

    public static void main(String[] args) {
        long startTime = new Date().getTime();
        for (int i = 0; i <100; i++) {
            //don't do this
            String name = new String("yanghua");
            if (i == 0) {
                logger.info(name + "does not say hello!");
            } else if (i == 1) {
                logger.info(name + "say hello " + i + "time");
            } else {
                logger.info(name + "say hello " + i + "times");
            }

        }
        long endTime = new Date().getTime();

        System.out.println(endTime-startTime);


    }
}
