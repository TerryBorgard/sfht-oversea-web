package com.ifunq.sfht.common.books.effective_java;

import com.ifunq.sfht.common.books.effective_java.modules.R5Father;
import com.ifunq.sfht.common.books.effective_java.modules.R5Son;

/**
 * R2
 * Created by  Yanghua on
 * Date：2017/4/5 Time：20:46
 * Description: 通过私有构造器强化不可以实例化的能力
 */
public class EffectiveJavaR5 {
    //强化不可以实例对象
    private EffectiveJavaR5() {
        throw new AssertionError();
    }

    public static void main(String[] args) {
        R5Son son = new R5Son();
        R5Son son2 = new R5Son();
        R5Father fater = new R5Son();
    }
}
