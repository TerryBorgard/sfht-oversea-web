package com.ifunq.sfht.common.books.effective_java.generic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by  Yanghua on
 * Date：2017/4/30 Time：21:00
 * Description:
 * R27 优先考虑泛型方法
 * ***********************
 */

public class EffectiveJavaR27<E> {

    //unchecked call to HashSet
    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    // Generic method
    public static <E> Set<E> union2(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> guys = new HashSet<String>(Arrays.asList("Tom", "Dick", "Harry"));

        Set<String> stooges = new HashSet<String>(Arrays.asList("Larry", "Moe", "Curly"));

        Set<String> aflCio = union2(guys, stooges);
        System.out.println(aflCio);
    }
}
