package com.ifunq.sfht.common.books.effective_java.class_and_interface;

/**
 * Created by  Yanghua on
 * Date：2017/4/11 Time：21:35
 * Description:
 * R21: 使用函数对象表示策略  内部内调用方法。
 */
public class EffectiveJavaR21 {

    public int ssss() {
        StringLenthComparator stringLenthComparator = new StringLenthComparator();
        return stringLenthComparator.compare("sss", "ss");
    }

    public static void main(String[] args) {
        //内部类实例化
        EffectiveJavaR21.StringLenthComparator stringLenthComparator = new EffectiveJavaR21().new StringLenthComparator();
        System.out.println(stringLenthComparator.compare("ssss", "sss"));

        EffectiveJavaR21 effectiveJavaR21 = new EffectiveJavaR21();
        System.out.println(effectiveJavaR21.ssss());
    }

    //java中没有函数，但是可以设计对象来进行策略性的操作。
    private class StringLenthComparator {
        public int compare(String s1, String s2) {
            return s1.length() - s2.length();
        }
    }
}


