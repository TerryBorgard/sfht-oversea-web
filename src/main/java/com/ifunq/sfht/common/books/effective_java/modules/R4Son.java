package com.ifunq.sfht.common.books.effective_java.modules;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by  Yanghua on
 * Date：2017/4/5 Time：23:44
 * Description:
 */
public class R4Son extends R4Father {
    public static final Logger logger = LoggerFactory.getLogger(R4Son.class);

    public R4Son() {
        logger.info("son create");
    }
}
