/*
 * breaktest1.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day03;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/1/10
 */
public class breaktest1 {
    public static void main(String[] args) {
        boolean breakout = false; //是否终止外部循环的标记
        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                System.out.println(i + ":" + j);
                if (0 == j % 2) {
                    breakout = true; //终止外部循环的标记设置为true
                    break;
                }
            }
            if (breakout) //判断是否终止外部循环
                break;
        }

    }
}
