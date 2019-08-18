package com.xncoding.pattern.flyweight.authorization;

/**
 * Client
 *
 * @author XiongNeng
 * @version 1.0
 * @since 2019/8/18
 */
public class Client {
    public static void main(String[] args) {
        //需要先登录，然后再判断是否有权限
        SecurityMgr mgr = SecurityMgr.getInstance();
        mgr.login("张三");
        mgr.login("李四");
        boolean f1 = mgr.hasPermit("张三", "薪资数据", "查看");
        boolean f2 = mgr.hasPermit("李四", "薪资数据", "查看");
        System.out.println("f1==" + f1);
        System.out.println("f2==" + f2);
        for (int i = 0; i < 3; i++) {
            mgr.login("张三" + i);
            mgr.hasPermit("张三" + i, "薪资数据", "查看");
        }
    }
}