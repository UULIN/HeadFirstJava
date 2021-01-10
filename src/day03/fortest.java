/*
 * fortest.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day03;

/**
 * Function: for循环练习1
 *
 * @author 云铮
 * @date 2020/12/28
 */
public class fortest {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5){
            System.out.println("while的输出：" + i );
            i++;
        }
        for (i = 0; i < 5; i++
        ) {
            System.out.println("for的输出是：" + i );
        }
    }
}
