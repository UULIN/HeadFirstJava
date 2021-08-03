/*
 * NewString.java
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
public class NewString {
    public static void main(String[] args) {
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
        String [] c = sentence.split(",");
        for (String sub : c) {
            System.out.println(sub);
        }

    }
}
