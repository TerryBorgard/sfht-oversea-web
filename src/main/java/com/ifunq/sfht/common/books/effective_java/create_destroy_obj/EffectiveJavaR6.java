package com.ifunq.sfht.common.books.effective_java.create_destroy_obj;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by  Yanghua on
 * Date：2017/4/9 Time：14:52
 * Description: 消除过期的对象引用
 */
public class EffectiveJavaR6 {
    /**  EffectiveJavaR6  like Stack 当做栈来看
     *  过期引用： 是指永远也不会再被解除的引用
     *  内存泄露是很隐蔽的。（称这类内存泄露为“无意识的对象保留”）
     */
    /**
     * 解决方法: 一旦对象引用已经过期，只需要清空这些引用即可
     */

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULE_INIT_CAPACITY = 16;

    public EffectiveJavaR6() {
        //初始化对象数据
        elements = new Object[DEFAULE_INIT_CAPACITY];
    }

    //进数据
    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    //弹出数据
    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    //弹出数据 清空不不要对象
    public Object pop2() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;  //eliminate obsolete  reference
        return result;
    }

    //确定容器
    private void ensureCapacity() {
        if (elements.length == size) {
            //复制当前对象，扩容
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }


    public static void main(String[] args) {
        EffectiveJavaR6 r6 = new EffectiveJavaR6();
        r6.push("11111");
        r6.push("22222");
        r6.push("33333");
        Object p1 = r6.pop2();
        r6.push("44444");
        System.out.println("第一次弹出数据，目的不是取用他" + p1);
    }
}
