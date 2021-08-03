/*
 * Account.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Intermediate.异常处理;

/**
 * Function: 银行账号异常
 *
 * @author 云铮
 * @date 2021/7/14
 */
public class Account {

    public double balance;//余额

    public Account(double balance){
        this.balance = balance;
    }

    //构造自定义异常
    class OverdraftException extends Exception{
        public double deficit;//透支额
        //无参构造
        public OverdraftException(){}
        //带参构造
        public OverdraftException( String message, double deficit){
            super(message);
            this.deficit = deficit;
        }

        public double getDeficit(){
            return deficit;
        }
    }

    //获取余额
    public double getBalance(){
        return balance;
    }

    //存钱
    public void deposit(double amt){
        this.balance += amt;
    }
    //取钱
    public void withdraw(double amt) throws OverdraftException{
        if (this.balance < amt){
            throw new OverdraftException("余额不足", amt - this.balance);
        }
        this.balance-=amt;
    }


    public static void main(String[] args) {
        Account a = new Account(1000);
        System.out.println(a.getBalance());
        a.deposit(1000);
        try {
            a.withdraw(3000);
        }catch (OverdraftException e){
            System.out.println("透支金额 :"+e.getDeficit());
            e.printStackTrace();
        }

    }
}
