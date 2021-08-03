/*
 * TestException1.java
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
 * @date 2021/5/31
 */
public class TestException1 {
    private static void method1(){
        try {
            method2();
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("打开文件失败");
        }

    }
    private static void method2() throws FileNotFoundException{
        File f1 = new File("E:haha.txt");
        new FileInputStream(f1);
        System.out.println("success");


    }
    public static void main(String[] args) {
//        File f1 = new File("E:haha.txt");
//        try{
//            new FileInputStream(f1);
//            System.out.println("success");
//
//        }catch (FileNotFoundException e){
//            System.out.println("文档打开失败");
//            e.printStackTrace();
//        }finally {
//            System.out.println("最终执行");
//        }
        method1();
    }
}
