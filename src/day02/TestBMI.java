/*
 * TestBMI.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day02;

import java.util.Scanner;

/**
 * Function: 练习关系操作符BMI
 *
 * @author 云铮
 * @date 2020/12/26
 */
public class TestBMI {
    public static void main(String[] args) {
        Scanner high = new Scanner(System.in);
        System.out.println("请输入您的身高（m）：");
        Scanner weight = new Scanner(System.in);
        System.out.println("请输入您的体重（KG）：");
        float BMI = weight.nextFloat() / (high.nextFloat() * high.nextFloat());


    }
}
