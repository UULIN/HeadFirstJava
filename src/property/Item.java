/*
 * Item.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package property;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/1/31
 */
public class Item {
    String name;
    int price;
    public void buy(){
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用后，可以有效果");
    }

    public static void main(String[] args) {
        Item l1 = new LifePotion();
        Item l2 = new MagicPotion();
        System.out.println("l1 执行打印：");
        l1.effect();
        System.out.println("l2 执行打印：");
        l2.effect();
    }
}
