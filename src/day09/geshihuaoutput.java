/*
 * geshihuaoutput.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day09;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/2/3
 */
public class geshihuaoutput {
    public static void main(String[] args) {
        String name = "盖伦";
        int kill = 8;
        String title = "超神";
        // 使用格式化输出
        String sentenceFormat = "%s 在进行了连续 %d 次击杀后，获得了 %s 的称号 %n";
        System.out.printf(sentenceFormat, name, kill, title);
    }
}
