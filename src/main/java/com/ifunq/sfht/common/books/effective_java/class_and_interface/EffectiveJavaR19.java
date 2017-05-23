package com.ifunq.sfht.common.books.effective_java.class_and_interface;

/**
 * Created by  Yanghua on
 * Date：2017/4/11 Time：21:35
 * Description:
 * R19 接口只用于定义类型
 */
public class EffectiveJavaR19 implements SayHello,PhysicalContants{
    /**
     * 当类实现接口，接口就可以充当引用这个类的实例的类型。
     * 为了其他目的来定义接口 都是不恰当的。
     *
     */

    //××××××××××常量接口模式 是对于接口不亮的使用×××××
    double  a  = BOLTZMANN_CONSTANT;

    @Override
    public void SayHello() {

    }

    
}