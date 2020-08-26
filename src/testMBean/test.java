/*
 * Copyright (c) 2015-2020, Zhejiang QiZhi Technologies Co., Ltd.
 * <http://www.shterm.com/>
 */
package testMBean;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

public class test {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        // 创建MBeanServer
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

        // 新建MBean ObjectName, 在MBeanServer里标识注册的MBean
        ObjectName name = new ObjectName("com.zgf.jmx:type=Hello");

        // 创建MBean
        Hello mbean = new Hello();

        // 在MBeanServer里注册MBean, 标识为ObjectName(com.tenpay.jmx:type=Echo)
        mbs.registerMBean(mbean, name);


        // 在MBeanServer里调用已注册的EchoMBean的print方法
        mbs.invoke(name, "print", new Object[] { "zgf"}, new String[] {"java.lang.String"});

        Thread.sleep(Long.MAX_VALUE);
    }

}
