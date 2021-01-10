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
        Scanner s = new Scanner(System.in);
        System.out.println("请输入您的名字：");
        String name = s.nextLine();
        System.out.println("请输入您的身高（m）：");
        float high = s.nextFloat();
        System.out.println("请输入您的体重（KG）：");
        float weight = s.nextFloat();

        float BMI = weight / (high * high);
        System.out.println("亲爱的 "+name+" 您的BMI是:"+BMI);
        if(BMI<18.5){
            System.out.println("体重过轻");
        }else if(18.5<=BMI && BMI<24){
            System.out.println("正常范围");
        }else if (24<=BMI && 27>BMI){
            System.out.println("体重过重");
        }else if (27<=BMI && 30>BMI){
            System.out.println("轻度肥胖");
        }else if (30<=BMI && 35>BMI){
            System.out.println("中度肥胖");
        }else if (35<=BMI){
            System.out.println("重度肥胖");
        }else {
            System.out.println("异常值");
        }


    }
}
