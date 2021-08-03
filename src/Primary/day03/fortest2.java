/*
 * fortest2.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Primary.day03;

import java.util.Scanner;

/**
 * Function: for练习题1
 *
 * @author 云铮
 * @date 2020/12/28
 */
    /*
    天朝有一个乞丐姓洪，去天桥要钱
    第一天要了1块钱
    第二天要了2块钱
    第三天要了4块钱
    第四天要了8块钱
    以此类推

    问题： 洪乞丐干10天，收入是多少？
     */
public class fortest2 {
    public static void main(String[] args) {
        int sum = 0;
        int moneyEachDay = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入天数：");
        int day = sc.nextInt();//定义天数
        for(int i=1; i <= day; i++){
            if (moneyEachDay == 0) {
                moneyEachDay = 1;
            }else {
                moneyEachDay *= 2;
            }
            sum += moneyEachDay;
            System.out.println("第"+i+"天要了"+sum+"块钱");
        }
    }
}
