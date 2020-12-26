/*
 * sanyuan.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day02;

import java.util.Scanner;

/**
 * Function: 三元操作符
 *
 * @author 云铮
 * @date 2020/12/26
 */
public class sanyuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1~7的整数：");
        String s = sc.nextInt() < 5 ? "今天是工作日" : "今天是周末";
        System.out.println("今天是"+s);
    }
}
