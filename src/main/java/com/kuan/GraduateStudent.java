package com.kuan;

public class GraduateStudent extends Student{
    public GraduateStudent(String name){
        //this.name=name;
        super(name);
    }
    public GraduateStudent(String name,int english, int math){
        super(name, english, math);
    }
}
