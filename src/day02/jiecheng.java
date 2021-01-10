/*
 * jiecheng.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day02;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Function: n的阶乘
 *
 * @author 云铮
 * @date 2020/12/27
 */
public class jiecheng {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int longint = 1;
        int num = sc.nextInt();
        while (num>=1){
            longint *= num;
            num--;
        }
        System.out.println("阶乘是"+ longint);
    }
}
