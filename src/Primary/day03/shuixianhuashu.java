/*
 * shuixianhuashu.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Primary.day03;
/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/1/13
 */
public class shuixianhuashu {
    public static void main(String[] args) {
        for(int i = 99; i <= 999; i++){
            int baiwei = i / 100 % 10;
            int shiwei = i / 10 % 10;
            int gewei = i % 10;
            int num = baiwei * baiwei * baiwei + shiwei * shiwei * shiwei + gewei * gewei *gewei;
            if (i == num){
                System.out.println(i);
            }
        }
    }

}
