package com.ifunq.sfht.common.books.effective_java.comman_util;

import java.util.Date;

/**
 * Description: 基本类型优先于封装类型
 * int double long > Integer Double Long
 * Created by yanghua on 2017/5/4.
 */
public class EffectiveJavaR49 {
    public static Integer i;

    public static void main(String[] args) {
//        tellme();
        tellmewhy();
        tellmewhy2();
    }

    public static void tellme() {
        if (i == 42) {
            System.out.println("unbelievable");
        }
    }

    public static void tellmewhy() {
        long startTime = new Date().getTime();
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        long endTime = new Date().getTime();
        long tastTime = endTime - startTime;
        System.out.println(tastTime);
    }

    public static void tellmewhy2() {
        long startTime = new Date().getTime();
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        long endTime = new Date().getTime();
        long tastTime = endTime - startTime;
        System.out.println(tastTime);
    }
}
