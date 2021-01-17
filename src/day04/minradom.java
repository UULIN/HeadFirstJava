/*
 * minradom.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day04;

import java.util.Arrays;

/**
 * Function: 判断数组的最小值
 *
 * @author 云铮
 * @date 2021/1/17
 */
public class minradom {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
        System.out.println("数组中各数值的平均数是：");
        for (int i = 0; i < a.length; i++
        ) {
            System.out.print(a[i] + " ");
            //假设数组中第一个数最小
        }
        System.out.println();
        int minnum = 100;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < minnum) {
                minnum = a[i];
            }
        }
        System.out.println(minnum);
    }

}
