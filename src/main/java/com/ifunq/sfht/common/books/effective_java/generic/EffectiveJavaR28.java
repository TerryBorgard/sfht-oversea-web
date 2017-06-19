package com.ifunq.sfht.common.books.effective_java.generic;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by  Yanghua on
 * Date：2017/4/30 Time：21:00
 * Description:
 * R28 利用有限制通配符来提升API的灵活性
 * ***********************
 */

public class EffectiveJavaR28<E> {
    /**
     * PECS 表示  producer-extends   consumer-super
     * 如果参数化类型试试一个T 生产者
     * <? extends T>
     * 表示T的消费者
     * <? super T>
     *
     */
    // Generic method
    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }
    // Generic method
    public static <E> Set<E> union2(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }


}
