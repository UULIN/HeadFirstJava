/*
 * TestGiantDragon.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day06;

/**
 * Function: test
 *
 * @author 云铮
 * @date 2021/1/30
 */
public class TestGiantDragon {
    public static void main(String[] args) {
        GiantDragon g1 = GiantDragon.getInstance();
        GiantDragon g2 = GiantDragon.getInstance();
        System.out.println(g1);
        System.out.println(g2);
    }
}
