/*
 * Hero.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package property;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2020/12/18
 */
public class Hero {
    public String name; //姓名
    protected float hp; //血量
    public void useItem(Item i){
        i.effect();
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        LifePotion l1 = new LifePotion();
        MagicPotion l2 = new MagicPotion();
        garen.useItem(l1);
        garen.useItem(l2);
    }
}
