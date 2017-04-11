package com.ifunq.sfht.common.books.effective_java.create_destroy_obj;

import com.ifunq.sfht.common.books.effective_java.create_destroy_obj.modules.R2NutritionFactsBuilder;
import com.ifunq.sfht.common.books.effective_java.create_destroy_obj.modules.R2NutritionFactsJB;
import com.ifunq.sfht.common.books.effective_java.create_destroy_obj.modules.R2NutritionFactsTC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * R2
 * Created by  Yanghua on
 * Date：2017/4/5 Time：20:46
 * Description:遇到多个构造器参数时，要考虑用【构建器】 差点看成构造器  建造者模式
 */
public class EffectiveJavaR2 {
    private static final Logger logger = LoggerFactory.getLogger(EffectiveJavaR2.class);
    //静态工厂方法、构造器比较有局限性 不能很好的扩展到大量可选参数

    /**
     * e.g(exempli gratia)
     * 用一个类表示包装食品的营养食品标签
     * 几个必须的域是必须的：每份含量、每罐含量以及每份的卡路里
     * 可选域：总脂肪量、饱和脂肪量、转化脂肪、胆固醇、钠 等等
     */
    public static void main(String[] args) {
        //TC模式   重叠构造器
        R2NutritionFactsTC tc = new R2NutritionFactsTC(10, 200, 22, 110, 20, 30);
        tc.toString();
        //JavaBeans模式
        /**
         * javabeans自身有着严重的缺陷，构造过程被分到了几个调用中，在构造javabean可能处于不一致状态
         * 考虑线程安全问题
         */
        R2NutritionFactsJB jb = new R2NutritionFactsJB();
        jb.setServingSize(10);
        jb.setServings(200);
        jb.setCaloris(22);

        R2NutritionFactsBuilder nb = new R2NutritionFactsBuilder.Builder(20, 10).caloris(10).fat(100).sodium(10).build();
        System.out.println(nb);

    }
}
