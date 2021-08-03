/*
 * MainItem01.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Primary.day01;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2020/12/18
 */
public class MainItem01 {
    public static void main(String[] args) {
        Item01 blood = new Item01("血瓶", 15);
        Item01 shoes = new Item01("鞋子", 20);
        Item01 weapon = new Item01("长剑",22);

        System.out.println(blood.getName() + "的价格是" + blood.getPrice());
        System.out.println(shoes.getName() + "的价格是" + shoes.getPrice());
        System.out.println(weapon.getName() + "的价格是" + weapon.getPrice());

    }
}
