package com.ifunq.sfht.common.books.effective_java.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  Yanghua on
 * Date：2017/4/30 Time：21:00
 * Description:
 * R23 请不要在新代码中使用原生态类型
 *
 *
 * */
public class EffectiveJavaR23 {
    /**
     * 泛型：泛型类和接口统一称为泛型
     * List<E> E的列表  1.5 List单一的数据类型
     * List<String>与List<E>： String 是与形式类型参数E相对应的实际参数类型
     * 每个泛型都定义了一个原生态类型 raw type
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        unsafeAdd(strings,new Integer(42));
        //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        String s = strings.get(0);
    }
    private static void unsafeAdd(List list,Object o){
        list.add(o);
    }

    /**
     * List<String> 参数化的类型
     * List<E> 泛型
     * List<?> 无限制通配符类型
     * List 原生态类型
     *
     */




}
