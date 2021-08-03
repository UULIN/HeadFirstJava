/*
 * Hero.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Primary.day06;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/1/28
 */
public class Hero {
    String name; // 姓名
    float hp; // 血量
    float armor; // 护甲
    int moveSpeed; //移动速度

    public Hero(String heroname){
        name = heroname;
        System.out.println("name" + name);
    }
    public Hero(String heroname, float herohp, float heroarmor, int heromovespeed){
        name = heroname;
        hp = herohp;
        armor = heroarmor;
        moveSpeed = heromovespeed;
        System.out.println(name + hp +" " + armor + " " + moveSpeed);

    }
    Hero h1 = new Hero("aaa",2222,222,3);

    public static void main(String[] args) {

    }
}
