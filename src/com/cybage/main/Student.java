package com.cybage.main;

public class Student {

    private String studentName;
    private int marks;

    public Student(){

    }
    public Student(String studentName, int marks) {
        this.studentName = studentName;
        this.marks = marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", marks=" + marks +
                '}';
    }
}
