/*
 * TestInputFile.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Intermediate.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/7/25
 */
public class TestInputFile {
    public static void main(String[] args) {
        try {
            File f1 = new File("/Users/lin/temp/inputtest.txt");
            //创建基于文件的输入流
            FileInputStream fis = new FileInputStream(f1);
            //创建字节数组，其长度就是文件的长度
            byte [] all = new byte[(int)f1.length()];
            //以字节流的形式读取文件所有内容
            fis.read(all);
            for (byte b:all){
                System.out.println(b);
            }
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
