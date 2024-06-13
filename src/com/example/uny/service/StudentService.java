package com.example.uny.service;

import com.example.uny.model.Db.DataBase;

import com.example.uny.model.impl.Student;

import java.util.List;

public class StudentService implements UserService<Student>{


    @Override
    public Student createUser(String name, String lastName, int groupId) {
        int id;
        int size = DataBase.studentsDb.size();
        if (size ==0){
            id = 1;

        } else{
            id = size+1;
        }
        Student student = new Student(id,name,lastName,groupId);
        DataBase.studentsDb.add(student);
        return student;
}

    @Override
    public Student getBuyId(int id) throws Exception {
        Student student = DataBase.studentsDb
                .stream()
                .filter(s -> s.getId()==id)
                .findFirst()
                .orElse(null);
        if (student == null){
            throw new Exception("Student not found");
        }
        return student;
    }

    @Override
    public List<Student> getAllUsers() {
        return DataBase.studentsDb;
    }
}









