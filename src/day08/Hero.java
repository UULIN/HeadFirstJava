/*
 * Hero.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day08;
import property.Item;


/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/1/31
 */
public class Hero {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }

    public Hero(){
        System.out.println("Hero的构造方法 ");
    }

    public static void main(String[] args) {
        new Hero();
    }
}
