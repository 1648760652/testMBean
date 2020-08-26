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
        // ����MBeanServer
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

        // �½�MBean ObjectName, ��MBeanServer���ʶע���MBean
        ObjectName name = new ObjectName("com.zgf.jmx:type=Hello");

        // ����MBean
        Hello mbean = new Hello();

        // ��MBeanServer��ע��MBean, ��ʶΪObjectName(com.tenpay.jmx:type=Echo)
        mbs.registerMBean(mbean, name);


        // ��MBeanServer�������ע���EchoMBean��print����
        mbs.invoke(name, "print", new Object[] { "zgf"}, new String[] {"java.lang.String"});

        Thread.sleep(Long.MAX_VALUE);
    }

}
