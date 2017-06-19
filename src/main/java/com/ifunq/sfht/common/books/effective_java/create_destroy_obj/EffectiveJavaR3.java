package com.ifunq.sfht.common.books.effective_java.create_destroy_obj;

import com.ifunq.sfht.common.books.effective_java.create_destroy_obj.modules.R3SingleTonEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * R2
 * Created by  Yanghua on
 * Date：2017/4/5 Time：20:46
 * Description: 用私有构造器或者美剧类型强化Singleton属性   单例模式
 */
public class EffectiveJavaR3 {
    private static final Logger logger = LoggerFactory.getLogger(EffectiveJavaR3.class);
    //method 1.私有化构造方法  公开实例化后的静态变量
    public static final EffectiveJavaR3 INSTANCE = new EffectiveJavaR3();
    //method 2.私有话构造方法，私有静态变量，公开静态工厂方法
    private static final EffectiveJavaR3 INSTANCE2 = new EffectiveJavaR3();

    /**
     * 1.5版本发行前 2种方法实现singleton
     * 1. 私有构造器方法,并导出公有静态成员
     * 构造器只被调用一次，用来实例化 公有的静态方法final  EffectiveJavaR3.INSTANCE
     * 线程安全问题？暂时没考虑
     */
    private EffectiveJavaR3() {

    }

    public static EffectiveJavaR3 getInstance() {
        return INSTANCE2;
    }

    public static void main(String[] args) {
        EffectiveJavaR3.getInstance();
        //枚举单例模式
        R3SingleTonEnum.INSTANCE.leaveTheBuilding();
    }
}
