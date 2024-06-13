package com.example.uny.Controller;

import com.example.uny.model.Db.DataBase;
import com.example.uny.model.User;
import com.example.uny.model.UserGroup;
import com.example.uny.model.impl.Student;
import com.example.uny.model.impl.StudentGroup;
import com.example.uny.model.impl.Teacher;
import com.example.uny.service.StudentGroupService;

import java.util.List;

public class StudentGroupController implements UserGroupController<StudentGroup, Teacher, Student> {

    StudentGroupService studentGroupService = new StudentGroupService();


    @Override
    public List<StudentGroup> createUserGroup(Teacher teacher) {

        return studentGroupService.createUserGroup(teacher,DataBase.studentsDb);

    }

    @Override
    public List<StudentGroup> getAllUserGroup() {
        return studentGroupService.getAllUserGroup();
    }
}
