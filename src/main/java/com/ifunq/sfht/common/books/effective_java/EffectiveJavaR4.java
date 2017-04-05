package com.ifunq.sfht.common.books.effective_java;

import com.ifunq.sfht.common.books.effective_java.modules.R4Father;
import com.ifunq.sfht.common.books.effective_java.modules.R4Son;

/**
 * R2
 * Created by  Yanghua on
 * Date：2017/4/5 Time：20:46
 * Description: 通过私有构造器强化不可以实例化的能力
 */
public class EffectiveJavaR4 {
    //强化不可以实例对象  并且该类不可以被子类话  extends
    // 子类会继承父类的构造方法？好像是的，常识忘记了
    //强化不可以实例对象
    private EffectiveJavaR4() {
        throw new AssertionError();
    }

    public static void main(String[] args) {
        R4Son son = new R4Son();
        R4Son son2 = new R4Son();
        R4Father fater = new R4Son();
    }

}
