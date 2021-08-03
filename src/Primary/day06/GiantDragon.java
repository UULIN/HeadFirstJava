/*
 * GiantDragon.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Primary.day06;

/**
 * Function: 饿汉单例模式
 *
 * @author 云铮
 * @date 2021/1/30
 */
public class GiantDragon {
    private GiantDragon(){
        // 私有化构造方法使该类无法通过new进行实例化
    }
    // 准备一个类属性，指向一个实例化对象。因为是类属性，所以只有一个
    private static GiantDragon instance = new GiantDragon();
    public static GiantDragon getInstance(){
        // public static , 提供给调用者获取12行定义的对象
        return instance;
    }

}
