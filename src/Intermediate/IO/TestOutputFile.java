/*
 * TestOutputFile.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Intermediate.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/7/25
 */
public class TestOutputFile {
    public static void main(String[] args) {
        File f = new File("/Users/lin/temp/outputtest.txt");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            byte data[] = {66, 67};
            fos.write(data);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
