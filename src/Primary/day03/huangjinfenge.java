/*
 * huangjinfenge.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Primary.day03;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/1/10
 */
public class huangjinfenge {
    public static void main(String[] args) {
        float hjfg = 0.618f;
        float mindiff = 100; // 黄金分割点
        int answerFenzi = 0; // 找到的分子
        int answerFenmu = 0; // 找到的分母
        for(int i = 1; i <= 20; i ++){
            for(int j = 1; j <= 20; j++){
                if ((i % 2 == 0 && j % 2 == 0)){
                    continue;
                }
                // 取值
                float value = (float) i / j;
                // 取离黄金分割点的差值
                float diff = value - hjfg;
                diff = diff < 0 ? 0 - diff : diff;

                // 找出最小的差值
                if (diff < mindiff) {
                    mindiff = diff;
                    answerFenzi = i;
                    answerFenmu = j;
                }
            }
        }

        System.out.println("离黄金分割点(" + hjfg + ")最近的两个数相除是:" + answerFenzi + "/" + answerFenmu + "="
                + ((float) answerFenzi / answerFenmu));
    }
}
