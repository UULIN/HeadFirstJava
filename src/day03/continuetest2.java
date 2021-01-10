/*
 * continuetest2.java
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
public class continuetest2 {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++){
            if (i % 3 == 0 || i % 5 == 0){
                continue;
            }
                System.out.println(i);
        }
    }

}
