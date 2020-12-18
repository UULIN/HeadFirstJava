/*
 * Item.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day01;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2020/12/18
 */
public class Item{
    String name; //物品名字
    int price; //物品价格

    public static void main(String[] args) {
        Item blood = new Item();
        blood.name = "血瓶";
        blood.price = 11;
    }
}
