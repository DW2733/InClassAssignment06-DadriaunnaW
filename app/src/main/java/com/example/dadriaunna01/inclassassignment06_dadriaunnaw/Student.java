package com.example.dadriaunna01.inclassassignment06_dadriaunnaw;

import java.io.Serializable;

/**
 * Created by cmltdstudent on 3/7/17.
 */

public class Student implements Serializable {
    private String name;
    private int grade;
    private boolean honors;

    public Student(String name, int grade, boolean honors) {
        this.name = name;
        this.grade = grade;
        this.honors = honors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isHonors() {
        return honors;
    }

    public void setHonors(boolean honors) {
        this.honors = honors;
    }

    @Override
    public String toString() {
        return "Name:'" + name + '\n' +
                "Grade=" + grade + '\n' +
                "Honors:" + honors;
    }

}

