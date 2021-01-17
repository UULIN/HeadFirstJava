/*
 * test.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day03;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/1/16
 */
public class test {
    public static void main(String[] args) {
        int i = 856;
        if (i == (i / 100 % 10)+(i / 10 % 10)+(i % 10)){
            System.out.println(i);
        }
        System.out.println(i / 100 % 10);
        System.out.println(i / 10 % 10);
        System.out.println(i % 10);
    }
}
