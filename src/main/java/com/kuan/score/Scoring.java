package com.kuan.score;

import com.kuan.score.GraduateStudent;
import com.kuan.score.Student;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        /*List<Student> students = new ArrayList<>();
        students.add(new Student("Tony",80,90));
        students.add(new Student("Jack",10,40));
        students.add(new GraduateStudent("Jane",90,75,90));

        for(Student s : students){
            s.print();
        }*/

        Student tony = new Student("Tony",80,90);
        Student jack = new Student("Jack",10,40);
        GraduateStudent jane =
                new GraduateStudent("Jane",90,75,90);
        tony.print();
        jack.print();
        jane.print();
        //tony.name = "Tony";
        //tony.english = 10;
        //tony.math = 90;
    }
}
