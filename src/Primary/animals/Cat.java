/*
 * Cat.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Primary.animals;

/**
 * Function:
 *
 * @author 云铮
 * @date 2021/1/31
 */
public class Cat extends Animal implements pet{
    protected String name;
    public Cat(String name){
        super(4);
        this.name = name;
    }
    public Cat(){
        this("");
    }

    @Override
    public void eat() {
        System.out.println("eating");

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(final String name) {
    }

    @Override
    public void play(){
        System.out.println("cat is playing");
    };
}
