package com.ifunq.sfht.common.books.effective_java.generic;

import com.ifunq.sfht.common.books.effective_java.create_destroy_obj.modules.R4Son;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by  Yanghua on
 * Date：2017/4/30 Time：21:00
 * Description:
 * R24 消除非受检警告
 *
 *
 * */
public class EffectiveJavaR24 {
    /**
     * 使用泛型   会碰到许多编译器警告，
     * 非受检强制转化 unchecked cast warnings
     * 非受检方法调用警告
     * 非受检普通数组创建警告
      */
    public static void main(String[] args) {

    }

    public void genericRule(){
        //wrong
        Set<R4Son> wrong = new HashSet();
        //right
        Set<R4Son>  right = new HashSet<R4Son>();
        //避免出现运行时异常 ClassCastException

        //just ok?  确保无误加标签
        @SuppressWarnings("unchecked")
        Set<R4Son> wrong2 = new HashSet();

        List<String> strings = new ArrayList<String>();
        strings.toArray();
    }
}
