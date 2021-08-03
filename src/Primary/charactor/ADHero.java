/*
 * ADHero.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Primary.charactor;

/**
 * Function: AD英雄
 *
 * @author 云铮
 * @date 2021/1/31
 */

public class ADHero extends Hero implements AD,Mortal{

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void die() {
        System.out.println("ad has die");
    }
}
