/*
 * MyStringBuffer.java
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
public class MyStringBuffer implements IStringBuffer{
    // 容量

    int capacity = 16;
    int length = 0;
    // 用于存放字符数组
    char[] value;
    // 无参构造方法
    public MyStringBuffer(){

        value  = new char[capacity];
    }
    // 带参构造方法
    public MyStringBuffer(String str){
        this();
        if (str == null){
            return;
        }
        if (capacity < str.length()){
            capacity = value.length * 2;
            value = new char[capacity];
        }
        if (capacity >= str.length()){
            System.arraycopy(str.toCharArray(),0,value,0,str.length());
        }
        length = str.length();

    }
    @Override
    public void append(final String str) {
        //追加字符串

    }

    @Override
    public void append(final char c) {

    }

    @Override
    public void insert(final int pos, final char b) {

    }

    @Override
    public void insert(final int pos, final String b) {
        //边界条件判断
        if (pos<0) return;
        if(pos>length) return;
        if(b==null) return;
        //扩容
        while (length + b.length() > capacity){
            capacity = (int)((length + b.length()) * 1.5f);
            char[] newValue = new char[capacity];
            System.arraycopy(value,0,newValue,0,length);
            value = newValue;
        }
        char[] cs = b.toCharArray();
        //把已存在的数据往后移
        System.arraycopy(value,pos,value,pos+cs.length,length-pos);

        //把要插入的数据插入到指定位置
        System.arraycopy(cs,0,value,pos,cs.length);

        length += cs.length;
    }

    @Override
    public void delete(final int start, final int end) {
        //边界条件判断
        if(start<0 || end<0 || start>end || start>length || end>length) return;
        System.arraycopy(value, end, value, start, length-end);
    }

    @Override
    public void reverse() {
        // 反转字符串
        for (int i = 0; i < length / 2; i++) {
            char temp = value[i];
            value[i] = value[length - i -1];
            value[length - i - 1] = temp;
        }
    }

    @Override
    public void delete(final int start) {

    }

    @Override
    public int length() {
        return 0;
    }
    public String toString(){
        char[] realValue = new char[length];
        System.arraycopy(value,0,realValue,0,length);
        return new String(realValue);
    }

    public static void main(String[] args) {
        MyStringBuffer mb = new MyStringBuffer("hello");

        mb.reverse();
        System.out.println(mb);

        mb.insert(0,"asdfsdfsd");
        System.out.println(mb);
        mb.insert(10,"aaaaaaaaaaaaaaaaaa");
        System.out.println(mb);
    }
}
