package com.example.uny.Controller;

import com.example.uny.model.impl.Student;
import com.example.uny.service.StudentService;

import java.util.List;

public class StudentController implements UserController<Student> {
    StudentService studentService = new StudentService();


    @Override
    public Student createUser(String name, String lastName, int groupId) {
        return studentService.createUser(name,lastName,groupId);
    }

    @Override
    public Student getById(int id) {
        Student student = null;
        try {
            student = studentService.getBuyId(id);
        }catch (Exception e){
            System.out.println(e.getMessage());

    }
        return student;
    }

    @Override
    public List<Student> getAllUsers() {
        return studentService.getAllUsers();
    }
}
