package com.example.uny.Controller;

import com.example.uny.model.impl.Student;
import com.example.uny.model.impl.Teacher;
import com.example.uny.service.TeacherService;

import java.util.List;

public class TeacherController implements UserController<Teacher> {

   TeacherService teacherService = new TeacherService();

    @Override
    public Teacher createUser(String name, String lastName, int groupId) {
        return teacherService.createUser(name,lastName, groupId);
    }

    @Override
    public Teacher getById(int id) {
        Teacher teacher = null;
        try {
            teacher = teacherService.getBuyId(id);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
        return teacher;
    }

    @Override
    public List<Teacher> getAllUsers() {
        return teacherService.getAllUsers();
    }


    public Teacher getByIdGroup(int idGroup) {
        Teacher teacher = null;
        try{
            teacher = teacherService.getBuyIdgroup(idGroup);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return teacher;
    }

    public void addGroupId(Teacher teacher, int idGroup){
        teacherService.addGroupId(teacher,idGroup);
    }
}
