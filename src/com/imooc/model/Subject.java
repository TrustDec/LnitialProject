package com.imooc.model;

public class Subject {
    private String subjectName;
    private String getSubjectNo;
    private int subjectLife;
//    无参构造
    public Subject(){

    }
//    带参构造
    public Subject(String subjectName,String getSubjectNo,int subjectLife){
        this.setGetSubjectNo(getSubjectNo);
        this.setSubjectLife(subjectLife);
        this.setSubjectName(subjectName);
    }
    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }

    public int getSubjectLife() {
        return subjectLife;
    }

    public void setGetSubjectNo(String getSubjectNo) {
        this.getSubjectNo = getSubjectNo;
    }

    public void setSubjectLife(int subjectLife) {
        if (subjectLife<=0) return;
        this.subjectLife = subjectLife;
    }

    public String getGetSubjectNo() {
        return getSubjectNo;
    }

    public String getSubjectName() {
        return subjectName;
    }
    public String info(){
        String str = "专业\n"+this.getSubjectName()+"编号\n"+this.getSubjectLife()+"学制\n"+this.getGetSubjectNo();
        return str;
    }
}

