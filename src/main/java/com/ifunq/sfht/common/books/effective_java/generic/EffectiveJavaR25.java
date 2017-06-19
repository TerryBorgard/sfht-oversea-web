package com.ifunq.sfht.common.books.effective_java.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  Yanghua on
 * Date：2017/4/30 Time：21:00
 * Description:
 * R25 列表由于数组
 *
 *
 * */
public class EffectiveJavaR25 {
    /**
     * 数组  协变
     * 泛型是不可变的。
     *  List []
      */
    public static void main(String[] args) {
        //java.lang.ArrayStoreException
        genericRule();
        // List 比 [] 在数据编译时就报错了
        genericRule2();

    }
    public static void genericRule(){
        Object[] objectArray = new Long[1];
        objectArray[0] = "i don't fit in";
    }

    public static void genericRule2(){
      //  List<Object> ol = new ArrayList<Long>();  编译就失败了
        List<Object> ol = new ArrayList<>();
        ol.add("i don't fit in");
    }

}
