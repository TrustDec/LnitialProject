package com.imooc.animal;

public class Dog extends Animal {
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void sleep(){
        System.out.println(this.getName()+"现在"+this.getMonth()+"大了,他在睡觉");
    }
}
