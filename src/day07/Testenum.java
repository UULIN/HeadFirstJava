/*
 * Testenum.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day07;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/1/31
 */
public class Testenum {
    public static void main(String[] args) {
        for(Season s: Season.values()){
            System.out.println(s);
        }
    }
}
