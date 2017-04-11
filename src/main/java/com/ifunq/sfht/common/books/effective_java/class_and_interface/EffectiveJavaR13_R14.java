package com.ifunq.sfht.common.books.effective_java.class_and_interface;

/**
 * Created by  Yanghua on
 * Date：2017/4/9 Time：16:15
 * Description:
 * R13 使类和成员的访问性最小化
 * R14 在公有类中使用访问方法而非公有域
 */
public class EffectiveJavaR13_R14 {
    /**
     * 安全控制域   private  protected default public
     * 公有类不应该直接暴露数据
     * 变量私有化，用公有方法set get方法暴露出去
     */
    //私有属性，公共获取方法
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
