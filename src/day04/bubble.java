/*
 * bubble.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day04;

/**
 * Function:  冒泡排序
 *
 * @author 云铮
 * @date 2021/1/17
 */
public class bubble {
    public static void main(String[] args) {
        int [] a = new int[]{19,22,1,222,33,4};
        for (int i = 0; i < a.length; i++) {
            for (int j = i +1; j < a.length; j++){
                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " " );
        }
    }
}
