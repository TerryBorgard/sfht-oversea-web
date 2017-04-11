package com.ifunq.sfht.common.books.effective_java.general_methods
        ;

/**
 * Created by  Yanghua on
 * Date：2017/4/9 Time：16:02
 * Description:
 * R8 覆盖equals时 情遵守通用约定。
 * R9 覆盖equals时 总要覆盖hashCode。
 * R10 始终要覆盖toString方法。
 * R11 谨慎使用clone方法
 */
public class EffectiveJavaR8_11 extends Thread {
    /**
     * 覆盖equals方法看似简单，但是有需要多覆盖方法会导致错误
     * 注意通用约定
     * 类的每个实例本质上都是唯一的，对于代表活动实例而不是value的类却是如此，例如Thread没。
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //线程中克隆方法是不支持的
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
