/*
 * NewStringBuffer.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Primary.数字与字符串;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/5/23
 */
public class NewStringBuffer {
    public static void main(String[] args) {
        String st1 = "new let";
        StringBuffer sb = new StringBuffer(st1);
        sb.append("dfsd");
        System.out.println(sb);
        sb.delete(6,8);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
