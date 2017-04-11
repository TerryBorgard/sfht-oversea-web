package com.ifunq.sfht.common.books.effective_java.create_destroy_obj.modules;

/**
 * Created by  Yanghua on
 * Date：2017/4/5 Time：22:08
 * Description: R2定义的营养标签
 * telesoping constructor 重叠构造器
 * 吐槽:神经病啊 整段垮掉!
 */
public class R2NutritionFactsBuilder {
    private final int servingSize;   //ml             required
    private final int servings;      //per container  required
    private final int caloris;       //               optional
    private final int fat;           //g              optional
    private final int sodium;        //mg             optional
    private final int carbohydrate;  //g              optional

    public static class Builder {
        private final int servingSize;
        private final int servings;
        private int caloris = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servings = servings;
            this.servingSize = servingSize;
        }

        public Builder caloris(int caloris) {
            this.caloris = caloris;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public R2NutritionFactsBuilder build() {
            return new R2NutritionFactsBuilder(this);
        }
    }

    private R2NutritionFactsBuilder(Builder builder) {
        servings = builder.servings;
        servingSize = builder.servingSize;
        caloris = builder.caloris;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;

    }

    @Override
    public String toString() {
        return "R2NutritionFactsBuilder{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", caloris=" + caloris +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
