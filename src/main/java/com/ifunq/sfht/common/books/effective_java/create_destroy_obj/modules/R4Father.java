package com.ifunq.sfht.common.books.effective_java.create_destroy_obj.modules;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by  Yanghua on
 * Date：2017/4/5 Time：23:41
 * Description: 用于尝试extends方法 是否继承了父类构造参数
 */
public class R4Father {
    private static final Logger logger = LoggerFactory.getLogger(R4Father.class);

    public R4Father() {
        logger.info("father create");
    }
}
