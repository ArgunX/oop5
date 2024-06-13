package com.example.uny.view;

import com.example.uny.Controller.StudentGroupController;
import com.example.uny.model.Db.DataBase;
import com.example.uny.model.impl.StudentGroup;
import com.example.uny.model.impl.Teacher;

import java.util.List;
import java.util.Scanner;

public class StudentGroupView {
    private StudentGroupController studentGroupController = new StudentGroupController();
    private StudentView studentView = new StudentView();
    private TeacherView teacherView = new TeacherView();
    public void start() {
        DataBase.fillDb();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Войти в меню студентов");
            System.out.println("2 - Войти в меню учителей");
            System.out.println("3 - Сформировать группы студентов по учителю");
            System.out.println("4 - Распечатать сформированные учебные группы");
            System.out.println("5 - Завершить работу");
            switch (scanner.nextInt()) {
                case 1 -> studentView.start();
                case 2 -> teacherView.start();
                case 3 -> createUserGroup();
                case 4 -> getAllUserGroup();
                case 5 -> System.exit(0);

                default -> System.out.println("Операция не поддерживается");

            }


        }


    }

    private List<StudentGroup> createUserGroup(){
        Teacher teacher = teacherView.getById();
       List <StudentGroup> studentGroup = studentGroupController
                .createUserGroup(teacher);
        System.out.println(studentGroup);
        return studentGroup;
    }
    private List<StudentGroup> getAllUserGroup(){
        List<StudentGroup> studentGroups = studentGroupController.getAllUserGroup();
        System.out.println(studentGroups);
        return studentGroups;
    }
}
