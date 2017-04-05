package com.ifunq.sfht.common.books.effective_java.modules;

/**
 * Created by  Yanghua on
 * Date：2017/4/5 Time：22:08
 * Description: R2定义的营养标签
 * telesoping constructor 重叠构造器
 * 吐槽:神经病啊 整段垮掉!
 */
public class R2NutritionFactsTC {
    private final int servingSize;   //ml             required
    private final int servings;      //per container  required
    private final int caloris;       //               optional
    private final int fat;           //g              optional
    private final int sodium;        //mg             optional
    private final int carbohydrate;  //g              optional

    public R2NutritionFactsTC(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }


    public R2NutritionFactsTC(int servingSize, int servings, int caloris) {
        this(servingSize, servings, caloris, 0);
    }

    public R2NutritionFactsTC(int servingSize, int servings, int caloris, int fat) {
        this(servingSize, servings, caloris, fat, 0);
    }


    public R2NutritionFactsTC(int servingSize, int servings, int caloris, int fat, int sodium) {
        this(servingSize, servings, caloris, fat, sodium, 0);
    }

    public R2NutritionFactsTC(int servingSize, int servings, int caloris, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.caloris = caloris;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    @Override
    public String toString() {
        return "R2NutritionFactsTC{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", caloris=" + caloris +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
