package com.mako.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
//        com.mako.kotlin.Student.getPass();

        Student.pass = 50;
        Student stu = new Student("Mako", 88, 100);
        stu.print();
        System.out.println("High score: " + stu.highest());
        Student stu2 = new Student("Timo", 60, 55);
        stu2.print();
        Student stu3 = new Student("Dean", 30, 65);
        stu3.print();

        GraduateStudent gstu = new GraduateStudent("Wood", 70,86,62);
        gstu.print();
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name:");
        String name = scanner.next();
        System.out.println("Please enter student's english score:");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math score:");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();

        System.out.println("High score: " + stu.highest());
    }
}
