/*
 * SwitchCase.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day02;

import java.util.Scanner;

/**
 * Function: Switch测试
 *
 * @author 云铮
 * @date 2020/12/27
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        String out1;
        switch (month){
        case 1:
        case 2:
        case 3:
            out1 = "春天";
            break;
        case 4:
        case 5:
        case 6:
            out1 = "夏天";
            break;
        default:
            out1 = "这是什么鬼";

        }
        System.out.println(out1);
    }
}
