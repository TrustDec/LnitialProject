package com.imooc.zuoye;

public class OfficeOA {
    private String name;
    private String gonghao;
    private String sex;
    private int age;
    private String bumen;
    private String zhiwu;
    public OfficeOA(String name,String gonghao,String sex,int age,String bumen,String zhiwu){
        this.setAge(age);
        this.setName(name);
        this.setSex(sex);
        this.setBumen(bumen);
        this.setZhiwu(zhiwu);
        this.setGonghao(gonghao);
    }

    public String getName() {
        return name;
    }

    public String getGonghao() {
        return gonghao;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getBumen() {
        return bumen;
    }

    public String getZhiwu() {
        return zhiwu;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGonghao(String gonghao) {
        this.gonghao = gonghao;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBumen(String bumen) {
        this.bumen = bumen;
    }

    public void setZhiwu(String zhiwu) {
        this.zhiwu = zhiwu;
    }
    public String shuchuMess(OfficeOA myOAObject ){
        System.out.println("==================");
        String str = "姓名:"+myOAObject.getName()+"\n工号:"+myOAObject.getGonghao()
                +"\n性别:"+myOAObject.getSex()+"\n年龄:"+myOAObject.getAge()+"\n职务:"+myOAObject.getZhiwu();
        return str;
    }
}
