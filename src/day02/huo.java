/*
 * huo.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day02;

/**
 * Function: 长路或和短路或，任意为真，则为真，都为假则为假
 *
 * @author 云铮
 * @date 2020/12/24
 */
public class huo {
    public static void main(String[] args){
        //长路或无论第一个是否为true，都会计算第二个，短路或则相反
        int i = 2;
        System.out.println(i == 1 |  ++i == 3);
        System.out.println(i);
        int j = 2;
        System.out.println(i == 2 || ++i ==4);
        System.out.println(j);

    }
}
