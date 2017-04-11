package com.ifunq.sfht.common.books.effective_java.class_and_interface;


import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by  Yanghua on
 * Date：2017/4/11 Time：21:03
 * Description:
 * R16:复合优先于继承
 * 继承突出重用,使用不当的话使得程序脆弱。在包内部使用继承非常安全，子类和超类处于一个程序员搞！
 */
public class EffectiveJavaR16<E> extends HashSet<E> {
    private int addCount = 0;

    public EffectiveJavaR16() {

    }

    public EffectiveJavaR16(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }


    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        EffectiveJavaR16<String> a = new EffectiveJavaR16<>();
        a.addAll(Arrays.asList("aaa", "bbb", "ccc"));
        System.out.println(a.getAddCount());
        //期望结果是 3，结果是6、 实际上一个元素调用了两次，。 就算是可以把add接口重写，万一超类一概，当前类也是非常脆弱的
    }

}

