/*
 * IStringBuffer.java
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
public interface IStringBuffer {
    public void append(String str); //追加字符串
    public void append(char c);  //追加字符
    public void insert(int pos,char b); //指定位置插入字符
    public void insert(int pos,String b); //指定位置插入字符串
    public void delete(int start); //从开始位置删除剩下的
    public void delete(int start,int end); //从开始位置删除结束位置-1
    public void reverse(); //反转
    public int length(); //返回长度
}
