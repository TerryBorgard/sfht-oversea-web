package com.ifunq.sfht.common.books.effective_java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * R1
 * Created by  Yanghua on
 * Date：2017/4/5 Time：20:46
 * Description:考虑用静态工厂方法代替构造器
 */
public class EffectiveJavaR1 {
    private static final Logger logger = LoggerFactory.getLogger(EffectiveJavaR1.class);
    public static final Boolean TRUE = true;
    public static final Boolean FALSE = false;

    //Method1  构造方法创建对象
    public EffectiveJavaR1() {
        System.out.println("默认构造参数已经被我修改了");
    }

    //Method2 公有的静态工厂方法 避免创建对象 而是缓存起来，重复利用
    public static Boolean effectiveOrNot(boolean b) {
        logger.info("§静态工厂方法 VS §构造器  优势");
        logger.info("静态方法第一优势，声明有名称=>  effevtiveOrNot 怼不怼！ 构造器按照类的规范被给出，但是根据参数不同，有时候容易混淆内容");
        logger.info("静态方法第二优势，不必每次调用都创建一个新的对象。直接怼");
        logger.info("静态方法第三优势，静态方法可以返回类型的任何子类型的对象=>interface-based Framework；" +
                "接口为静态工厂方法提供了自然返回类型。接口中不能有静态方法所以按照惯例，接口TYPE的静态方法放在一个名为Types的类中");
        logger.info("静态方法第四优势，静态方法创建参数化类型使得代码更简洁(重用性高)*** 例如HashMap newInstance()");
        return b ? EffectiveJavaR1.TRUE : EffectiveJavaR1.FALSE;
    }

    /**
     * jdk 1.6 并没有更新
     *
     * @return
     */
    public static <K, V> HashMap<K, V> newInstance() {
        return new HashMap<K, V>();
    }

    public static void main(String[] args) {
        EffectiveJavaR1 r1 = new EffectiveJavaR1();
        EffectiveJavaR1.effectiveOrNot(false);
        //HashMap Old One
        Map<String, List<String>> oldMap = new HashMap<String, List<String>>();
        //如果实现静态工厂方法
        Map<String, List<String>> newMap = EffectiveJavaR1.newInstance();  //确实是可以用的，
        // 结果1.6默认参数 遗憾的是作者猜错了
        Map<String, List<String>> lastMap = new HashMap<>();
    }
}
