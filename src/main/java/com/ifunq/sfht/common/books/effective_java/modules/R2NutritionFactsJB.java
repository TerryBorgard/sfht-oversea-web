package com.ifunq.sfht.common.books.effective_java.modules;

/**
 * Created by  Yanghua on
 * Date：2017/4/5 Time：22:08
 * Description: R2定义的营养标签
 * JavaBeans
 * 吐槽:好写多了
 */
public class R2NutritionFactsJB {
    private int servingSize = -1;
    private int servings = -1;
    private int caloris = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCaloris(int caloris) {
        this.caloris = caloris;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    @Override
    public String toString() {
        return "R2NutritionFactsJB{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", caloris=" + caloris +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
