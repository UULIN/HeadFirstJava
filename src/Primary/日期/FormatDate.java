/*
 * FormatDate.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Primary.日期;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/6/25
 */
public class FormatDate {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date d = new Date();
        String str = sdf.format(d);

    }
}
