/*
 * finaltest.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day02;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2020/12/23
 */
public class finaltest {
    public static int method1(final int a){
        return a;
    }

    public static void main(String[] args) {
        finaltest fin = new finaltest();
        int b = fin.method1(10);
        int c = fin.method1(22);
        System.out.println(b+c);
    }

}
