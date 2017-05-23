package com.ifunq.sfht.common.books.effective_java.comman_util;

import java.math.BigDecimal;

/**
 * Description: 避免使用精度 float和double
 * Created by yanghua on 2017/5/4.
 */
public class EffectiveJavaR48 {
    public static void main(String[] args) {
        buyCandies2();
    }

    public static void buyCandies() {
        double funds = 1.00;
        int itemBought = 0;
        for (double price = 0.10; funds >= price; price += 0.10) {
            funds -= price;
            itemBought++;
        }
        System.out.println("itemBought" + itemBought);
        System.out.println("change:$" + funds);
    }

    public static void buyCandies2() {
        final BigDecimal TEN_CENTS = new BigDecimal(0.10);
        final BigDecimal TEN_CENTS2 = new BigDecimal("0.10");
        System.out.println(TEN_CENTS);
        System.out.println(TEN_CENTS2);
        System.out.println(TEN_CENTS == TEN_CENTS2);
        BigDecimal funds = new BigDecimal(1.00);
        BigDecimal funds2 = new BigDecimal("1.00");
        System.out.println(funds);
        System.out.println(funds2);
        System.out.println(funds==funds2);
        int itemBought = 0;

        for (BigDecimal price = TEN_CENTS;
             funds.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {

            itemBought++;
            funds = funds.subtract(price);
        }
        System.out.println("itemBought"+itemBought);
        System.out.println("changes$$"+funds);
    }


    public static void buyCandies3() {
        final int TEN = 10;
        int funds = 100;
        int itemBought = 0;

        for (int price = 10; funds>=price; price += TEN) {
            itemBought++;
            funds = funds-price;
        }
        System.out.println("itemBought"+itemBought);
        System.out.println("changes$$"+funds);
    }
}