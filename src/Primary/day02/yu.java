/*
 * yu.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Primary.day02;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2020/12/24
 */
public class yu {
    public static void main(String[] args) {
        // 长路与、短路与 &、&&
        /*
        长路与是无论第一个值是真是假，两边都会执行
        短路与是第一个值为假时，就执行结束
        都为真时，才为真，任意为假，便为假
         */
        int i = 1;
        System.out.println( i == 2 & i++ == 3 );
        System.out.println(i);
        int j = 2;
        System.out.println(j == 1 && j++ == 3);
        System.out.println(j);
    }
}
