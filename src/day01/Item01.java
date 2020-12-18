/*
 * Item01.java
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
public class Item01 {
    private String name; //定义name
    private int price; //定义价格
    Item01(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}


