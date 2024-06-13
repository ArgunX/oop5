package com.example.uny.view;


import com.example.uny.Controller.TeacherController;

import com.example.uny.model.impl.Teacher;

import java.util.List;
import java.util.Scanner;

public class TeacherView {
    private TeacherController teacherController = new TeacherController();

    public void start(){

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1 - Создать учителя");
            System.out.println("2 - Найти учителя по id");
            System.out.println("3 - Распечатать инфо обо всех учителях");
            System.out.println("4 - Найти учителя по id группы");
            System.out.println("5 - Добавить группу учителю");
            System.out.println("6 - Назад");
            switch (scanner.nextInt()){
                case 1 -> createUser();
                case 2 -> getById();
                case 3 -> getAllUsers();
                case 4 -> getByIdgroup();
                case 5 -> addGroupId();
                case 6 -> {return;}

                default -> System.out.println("Операция не поддерживается");
            }

        }
    }

    protected Teacher createUser() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String lastname = scanner.nextLine();
        System.out.println("Введите номер группы: ");
        int groupId = scanner.nextInt();
        Teacher teacher = teacherController.createUser(name,lastname,groupId);
        System.out.println(teacher);
        return teacher;
    }



    protected Teacher getById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id учителя");
        int id = scanner.nextInt();
        Teacher teacher = teacherController.getById(id);
        System.out.println(teacher);
        return teacher;
    }


    protected List<Teacher> getAllUsers() {
        List<Teacher> teachers = teacherController.getAllUsers();
        System.out.println(teachers);
        return teachers;
    }

    protected Teacher getByIdgroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер группы учителя");
        int idGroup = scanner.nextInt();
        Teacher teacher = teacherController.getByIdGroup(idGroup);
        System.out.println("Ваш учитель: "+ teacher);
        return teacher;
    }

    protected void addGroupId(){
        getAllUsers();
        Teacher teacher = getById();
        System.out.println("Введите номер группы, которую хотите добавить:");
        Scanner scanner = new Scanner(System.in);
        int idGroup = scanner.nextInt();
        teacherController.addGroupId(teacher,idGroup);


    }
}
