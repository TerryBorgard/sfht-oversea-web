package com.ifunq.sfht.common.books.effective_java.enums;

import com.ifunq.sfht.common.books.effective_java.enums.modual.Apple;
import com.ifunq.sfht.common.books.effective_java.enums.modual.Orange;

/**
 * Created by  Yanghua on
 * Date：2017/4/30 Time：21:00
 * Description:
 * R30 用ENUM 代替int 常量
 * ***********************
 */

public class EffectiveJavaR30 {
    /**
     * 这种方法乘坐int 枚举。 存在很多不足，他在类型安全性和使用方面没有任何帮助
     * 如果将apple 传到想要的orange中，变异不会出现警告
     * 还会用几个== 操作符将apple 和orange 进行对比
     */
    /**
     * 枚举(enum type) 只是由一组固定的常量组合法制的类型
     * 例如一年的季节，太阳系的行星，一副牌中国的花色。
     * 以前没引用枚举的之前，表示枚举类型的常用模式是声明一组具名的int常量
     */

    //出现的问题..编译  
    int i = (Apple.APPLE_FUJI - Orange.ORANGE_TEMPLE);



}

