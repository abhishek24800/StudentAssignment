package com.cybage.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
        private static int count = 0;

        public static int getChoice(Scanner scanner){
            int choice = 0 ;
            try {
                System.out.println("Press 1 for Adding Student");
                System.out.println("Press 2 for Sort student by Ascending Order");
                System.out.println("Press 3 for Sort student by Descending Order");
                System.out.println("Press 4 for printing Student data");
                System.out.println("Press 5 for Quit");
                System.out.println("Make your choice");
                choice = scanner.nextInt();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
            return choice;
        }
        public static void addStudent(Student students[],Scanner scanner){

            System.out.println("Enter Student Name: ");
            String name = scanner.next();
            scanner.nextLine();
            System.out.println("Enter Student Marks: ");
            int marks = scanner.nextInt();
            while(marks<0 || marks > 100){
                System.out.println("marks must be between 0 and 100");
                marks = scanner.nextInt();
            }

            students[count++]= new Student(name,marks);
            System.out.println("Student added successfully");
        }
        public static void displayRecord(Student students[],int count){
            System.out.println();
            for(int i=0;i<count;i++){
                System.out.println(students[i]);
            }
            System.out.println();
        }
        public static void main(String[] args)  {
            Student students[] = new Student[100];
            CustomSort sort = new CustomSort();
            int choice;
                while(true) {
                                Scanner scanner = new Scanner(System.in);
                                choice = getChoice(scanner);
                                switch (choice) {

                                                     case 1:
                                                                addStudent(students,scanner);
                                                                break;
                                                     case 2:
                                                                sort.sortAscending(students,count);
                                                                System.out.println("data sorted in ascending order");
                                                                break;
                                                     case 3:
                                                                sort.sortDescending(students,count);
                                                                System.out.println("data sorted in descending order");
                                                                break;
                                                     case 4:
                                                                System.out.print("**********************************");
                                                                displayRecord(students,count);
                                                                System.out.print("**********************************");
                                                                break;
                                                     case 5:
                                                                scanner.close();
                                                                System.exit(0);
                                                     default:
                                                                System.out.println("Invalid choice!!! Please make a valid choice.");
                                }
                             }


                }
}
