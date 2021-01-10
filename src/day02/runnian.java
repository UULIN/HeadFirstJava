/*
 * runnian.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day02;

import java.util.Scanner;

/**
 * Function: 判断是否是闰年
 *
 * @author 云铮
 * @date 2020/12/27
 */
public class runnian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        if(year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)){
            System.out.println(year + " 这一年是闰年");

        }else {
            System.out.println(year + " 这一年不是闰年");
        }
    }
}
