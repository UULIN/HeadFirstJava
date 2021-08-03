/*
 * shuzufanzhuan.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Primary.day04;

/**
 * Function: 数组反转
 *
 * @author 云铮
 * @date 2021/1/17
 */
public class shuzufanzhuan {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
        System.out.println("数组中各数值是：");
        for (int i = 0; i < a.length; i++
        ) {
            System.out.print(a[i] + " ");
            //假设数组中第一个数最小
        }

        System.out.println();
    }
}
