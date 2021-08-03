/*
 * TestFile.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Intermediate.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Function: 文件夹相关操作
 *
 * @author 云铮
 * @date 2021/7/14
 */
public class TestFile {
    public static void main(String[] args) {

        File f = new File("/Users/lin/Downloads/filetest.txt");
        try {
            FileInputStream fs = new FileInputStream(f);
            byte all[] = new byte[(int)(f.length())];
            fs.read(all);
            for(byte b : all){
                System.out.println(b);
            }
            fs.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
