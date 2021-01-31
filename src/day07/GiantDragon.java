/*
 * GiantDragon.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package day07;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/1/30
 */
public class GiantDragon {
    private GiantDragon(){

    }
    private static GiantDragon instance;
    public static GiantDragon getInstance(){
        if (instance == null){
            instance = new GiantDragon();
        }
        return instance;
    }
}
