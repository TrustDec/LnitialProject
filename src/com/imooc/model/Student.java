package com.imooc.model;

public class Student {
    private String studentNo;
    private String studentName;
    private int studentSex;
    public Student(){

    }
    public Student(String studentNo,String studentName,int studentSex){
        this.setStudentNo(studentNo);
        this.setStudentName(studentName);
        this.setStudentSex(studentSex);
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public void setStudentSex(int studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public int getStudentSex() {
        return studentSex;
    }
    public String introduction(){
        String str = "学生信息如下"+this.getStudentName()+this.getStudentNo()+this.getStudentSex();
        return str;
    }
}
