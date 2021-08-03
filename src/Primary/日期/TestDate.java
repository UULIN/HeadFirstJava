/*
 * TestDate.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Primary.日期;

import java.util.Date;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/6/25
 */
public class TestDate {
    public static void main(String[] args) {
        //当前时间
        Date d1 = new Date();

        System.out.println("当前时间：");
        System.out.println(d1);
        System.out.println();
        Date d2 = new Date(5000);
        System.out.println("从1970年1月1日 早上8点0分0秒 开始经历了5秒的时间");
        System.out.println(d2);
        System.out.println("返回值：" + System.currentTimeMillis());

    }




}
