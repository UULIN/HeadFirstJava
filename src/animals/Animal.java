/*
 * Animals.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package animals;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/1/31
 */
public abstract class Animal {
    protected int legs;
    protected  Animal(int legs){
        this.legs = legs;
    }
    public abstract void eat();
    public void walk(){
        System.out.println("用"+legs+"条腿行走");
    }
}
