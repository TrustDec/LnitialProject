package com.imooc.zuoye;

public class OfficeOATest {
    public static void main(String[] args) {
        OfficeOA oa1 = new OfficeOA("张明","S001","男",29,"人事部","经理");
        System.out.println(oa1.shuchuMess(oa1));
        OfficeOA oa2 = new OfficeOA("李爱爱","S002","女",21,"人事部","助理");
        System.out.println(oa2.shuchuMess(oa2));
        OfficeOA oa3 = new OfficeOA("孙超","S004","男",29,"人事部","职员");
        System.out.println(oa3.shuchuMess(oa3));
        OfficeOA oa4 = new OfficeOA("孙梅梅","S005","女",26,"市场部","职员");
        System.out.println(oa4.shuchuMess(oa4));
        OfficeOA oa5 = new OfficeOA("蓝底","S006","男",37,"市场部","经理");
        System.out.println(oa5.shuchuMess(oa5));
        OfficeOA oa6 = new OfficeOA("米粒","S007","女",24,"市场部","职员");
        System.out.println(oa6.shuchuMess(oa6));

    }
}
