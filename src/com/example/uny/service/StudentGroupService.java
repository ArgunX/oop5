package com.example.uny.service;

import com.example.uny.model.Db.DataBase;
import com.example.uny.model.impl.Student;
import com.example.uny.model.impl.StudentGroup;
import com.example.uny.model.impl.Teacher;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class StudentGroupService implements UserGroupService<StudentGroup,Teacher,Student> {


    @Override
    public List<StudentGroup> createUserGroup (Teacher teacher, List<Student> students)  {

        List<StudentGroup> temp= new ArrayList<>();

        for (Integer groupId : teacher.getGroups()) {
            StudentGroup studentGroup = new StudentGroup(teacher, new ArrayList<>());

         for (Student student : students) {
            if (groupId == (student.getGroupId())){
                studentGroup.addUser(student);

            }


        } if(!studentGroup.getUsers().isEmpty()){
             DataBase.studentGroupDb.removeIf(dbgroup -> dbgroup.getUser()
                     .getId() == teacher.getId());


         }

            temp.add(studentGroup);
        }
        DataBase.studentGroupDb.addAll(temp);
        return temp;


    }

    @Override
    public List<StudentGroup> getAllUserGroup() {
        return DataBase.studentGroupDb;
    }
}
