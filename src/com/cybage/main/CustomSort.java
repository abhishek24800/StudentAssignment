package com.cybage.main;

public class CustomSort implements Sortable<Student,Integer>{

    @Override
    public void sortAscending(Student[] students,Integer count) {
        Student temp = null;
        for (int i=0; i<count;i++){
            for (int j=i+1;j<count;j++){
                if (students[i].getMarks()>students[j].getMarks()){
                    temp=students[i];
                    students[i]=students[j];
                    students[j]=temp;
                }
            }
        }

    }

    @Override
    public void sortDescending(Student[] students,Integer count) {
        Student temp = null;
        for (int i=0; i<count;i++){
            for (int j=i+1;j<count;j++){
                if (students[i].getMarks()<students[j].getMarks()){
                    temp=students[i];
                    students[i]=students[j];
                    students[j]=temp;
                }
            }
        }

    }
}
