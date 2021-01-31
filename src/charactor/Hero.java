/*
 * Hero.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package charactor;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2020/12/18
 */
public class Hero {
    public String name;
    protected float hp;
    public void kill(Mortal m){
        System.out.println(m + "has been killed");
        m.die();
    }

    public static void main(String[] args) {
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        ADAPHero adap = new ADAPHero();
        ADHero ad = new ADHero();
        APHero ap = new APHero();
        adap.kill(adap);
        ad.kill(ad);
        ap.kill(ap);
    }
}
