package com.ifunq.sfht.common.books.effective_java.create_destroy_obj;

/**
 * Created by  Yanghua on
 * Date：2017/4/9 Time：15:34
 * Description: 避免使用终结方法:finalizer
 */
public class EffectiveJavaR7 {
    /**
     * finalizer 通常是不可预测的 也是很危险的。一般情况下是不必要的。
     * 不是不可以用，只是根据经验，应该避免使用 .
     */
    /**
     * why   延迟终结与gc违背
     * 然而需要终结的时候  我们可以用try finally 代替
     */

}