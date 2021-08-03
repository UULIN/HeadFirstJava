/*
 * Hero.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Intermediate.异常处理;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/7/14
 */
public class Hero {
    //创建自定义异常类，继承exception方法
    class EnemyHeroIsDeadException extends Exception{
        public EnemyHeroIsDeadException(){}
        public EnemyHeroIsDeadException(String msg){
            super(msg);
        }
    }
    //定义名字
    public String name;
    //定义生命值
    protected float hp;
    //定义攻击类型异常方法
    public void attackHero(Hero h) throws EnemyHeroIsDeadException{
        if (h.hp == 0){
            throw new EnemyHeroIsDeadException(h.name + "已经挂了，当前hp为0，不能释放技能");
        }
    }

    public static void main(String[] args) {
        Hero gailun = new Hero();
        gailun.name = "盖伦";
        gailun.hp = 600;
        Hero timo = new Hero();
        timo.name = "提莫";
        timo.hp = 0;
        //盖伦攻击提莫
        try {
            gailun.attackHero(timo);
        }catch (EnemyHeroIsDeadException e){
            System.out.println("异常原因：" + e.getMessage());
            e.printStackTrace();
        }
    }
}
