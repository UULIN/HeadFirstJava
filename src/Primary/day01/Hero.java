/*
 * Hero.java
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
public class Hero {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;

        Hero teemo = new Hero(); //new一个timo
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
    }
}
