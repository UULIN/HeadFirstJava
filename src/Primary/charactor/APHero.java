/*
 * APHero.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Primary.charactor;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/1/31
 */
public class APHero extends Hero implements AP,Mortal {

    @Override
    public void magicAttack(){
        System.out.println("进行魔法攻击");
    }

    @Override
    public void die(){
        System.out.println("ap has die");
    }

}
