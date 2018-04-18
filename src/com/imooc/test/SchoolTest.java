package com.imooc.test;

import com.imooc.animal.Dog;
import com.imooc.model.Student;
import com.imooc.model.Subject;
import com.imooc.animal.Cat;

public class SchoolTest {
    public static void main(String[] args) {
//        Subject sub = new Subject("计算机科学与技术","J0001",-4);
//        System.out.println(sub.info());
//        Student stu = new Student("S01","张三",18);
//        System.out.printf(stu.introduction());
        Cat one = new Cat();
        one.setName("花花");
        one.setSpecies("中华田园猫");
        one.eat();
        one.run();
        System.out.println("===============");
        Dog two = new Dog();
        two.setName("妞妞");
        two.setMonth(1);
        two.eat();
        two.sleep();
    }
}
