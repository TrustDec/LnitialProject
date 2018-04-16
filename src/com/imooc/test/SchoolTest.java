package com.imooc.test;

import com.imooc.model.Subject;

public class SchoolTest {
    public static void main(String[] args) {
        Subject sub = new Subject("计算机科学与技术","J0001",4);
        System.out.printf(sub.info());
    }
}
