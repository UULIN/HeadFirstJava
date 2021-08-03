/*
 * TestException2.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Intermediate.异常处理;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/7/14
 */
public class TestException2 {
    public static void main(String[] args) {
        File f = new File("/Users/lin/Download/11.txt");
        try{
            System.out.println("试图打开 /Users/lin/Download/1.txt");
            new FileInputStream(f);
            System.out.println("成功打开 /Users/lin/Download/11.txt");
        }catch (FileNotFoundException e){
            System.out.println("/Users/lin/Download/1.txt 文件打开失败");
            e.printStackTrace();
        } finally {
            System.out.println("please retry");
        }
    }
}
