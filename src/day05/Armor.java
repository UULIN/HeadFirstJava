/*
 * Armor.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day05;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/1/24
 */



//armor继承Item
public class Armor extends Item {
    int ac;//护甲等级

    public static void main(String[] args) {
        Armor am1 = new Armor();
        Armor am2 = new Armor();
        am1.price = 300;
        am2.price = 500;
        am1.ac = 15;
        am2.ac = 40;
        am1.name = "布甲";
        am2.name = "锁子甲";

    }

}
