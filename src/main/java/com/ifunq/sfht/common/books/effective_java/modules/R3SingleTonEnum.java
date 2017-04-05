package com.ifunq.sfht.common.books.effective_java.modules;

/**
 * Created by  Yanghua on
 * Date：2017/4/5 Time：23:23
 * Description:
 */
public enum R3SingleTonEnum {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("ENUM can also build a singleton");
    }
}
