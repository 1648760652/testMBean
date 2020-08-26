/*
 * Copyright (c) 2015-2020, Zhejiang QiZhi Technologies Co., Ltd.
 * <http://www.shterm.com/>
 */
package testMBean;

public class Hello implements HelloMBean {

    @Override
    public void print(String yourName) {
        System.out.println("Hi " + yourName + "!");
    }

}
