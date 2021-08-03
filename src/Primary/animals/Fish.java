/*
 * Fish.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Primary.animals;

/**
 * Function:
 * @author 云铮
 * @date 2021/1/31
 */
public class Fish extends Animal implements pet {
    private String name;

    @Override
    public void walk() {
        System.out.println("鱼不能走且没有腿");
    }

    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("playing");

    }
}
