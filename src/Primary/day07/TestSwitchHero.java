/*
 * TestSwitchHero.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Primary.day07;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/1/31
 */
public class TestSwitchHero {

    public static void main(String[] args) {
        HeroType hero = HeroType.ASSASSIN;
        switch (hero){
        case PUSH:
            System.out.println("推进");
            break;
        case TANK:
            System.out.println("坦克");
            break;
        }

    }
}
