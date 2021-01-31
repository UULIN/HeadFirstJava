/*
 * Hero01.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day06;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/1/30
 */
public class Hero02 {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

   public void huixue(int xp){
       hp = hp + xp;
       xp = 0; // xp置空

   }
   public Hero02(String name, int hp){
       this.name = name;
       this.hp = hp;
   }

    public static void main(String[] args) {
        Hero02 h2 = new Hero02("nuoshou",198);
        int xueping = 100;
        h2.huixue(xueping);
        System.out.println(h2.hp);
        System.out.println(xueping);

    }
}
