package com.ifunq.sfht.common.books.effective_java.class_and_interface;

/**
 * Created by  Yanghua on
 * Date：2017/4/11 Time：21:35
 * Description:
 * R20:
 */
public class EffectiveJavaR20 implements SayHello,PhysicalContants{

    //××××××××××常量接口模式 是对于接口不亮的使用×××××
    double  a  = BOLTZMANN_CONSTANT;

    @Override
    public void SayHello() {
    }
}