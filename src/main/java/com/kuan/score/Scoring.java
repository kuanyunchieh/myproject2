package com.kuan.score;

import com.kuan.score.GraduateStudent;
import com.kuan.score.Student;

public class Scoring {
    public static void main(String[] args) {
        Student tony = new Student("Tony",80,90);
        Student jack = new Student("Jack",10,40);
        GraduateStudent jane =
                new GraduateStudent("Jane",90,75,90);
        //tony.name = "Tony";
        //tony.english = 10;
        //tony.math = 90;
        tony.print();
        jack.print();
        jane.print();
    }
}
