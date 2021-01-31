/*
 * Support.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package charactor;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/1/31
 */

public class Support extends Hero implements Healer{

    @Override
    public void heal(){
        System.out.println(name + " 进行辅助治疗");
    }
}
