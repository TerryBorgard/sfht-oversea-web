package com.ifunq.sfht.common.books.effective_java.modules;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by  Yanghua on
 * Date：2017/4/5 Time：23:44
 * Description:
 */
public class R5Son extends R5Father {
    public static final Logger logger = LoggerFactory.getLogger(R5Son.class);

    public R5Son() {
        logger.info("son create");
    }
}
