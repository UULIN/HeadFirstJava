/*
 * pet.java
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
public interface pet {
    // 提供该宠物的名字
    public String getName();

    // setName为该宠物命名
    public void setName(String name);

    // 提供play方法
    public void play();
}
