package com.example.uny.view;

import com.example.uny.Controller.StudentController;
import com.example.uny.model.Db.DataBase;
import com.example.uny.model.impl.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private StudentController studentController = new StudentController();

    public void start(){

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1 - Создать студента");
            System.out.println("2 - Найти студента по id");
            System.out.println("3 - Распечатать инфо обо всех студентах");
            System.out.println("4 - Назад");
            switch (scanner.nextInt()){
                case 1 -> createUser();
                case 2 -> getById();
                case 3 -> getAllUsers();
                case 4 -> {return;}

                default -> System.out.println("Операция не поддерживается");
            }

        }
    }

    protected Student createUser() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String lastname = scanner.nextLine();
        System.out.println("Введите номер группы: ");
        int groupId = scanner.nextInt();
       Student student = studentController.createUser(name,lastname,groupId);
        System.out.println(student);
        return student;
    }



    private Student getById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id студента");
        int id = scanner.nextInt();
        Student student = studentController.getById(id);
        System.out.println(student);
        return student;
    }


    private List<Student> getAllUsers() {
        List<Student> students = studentController.getAllUsers();
        System.out.println(students);
        return students;
    }
}
