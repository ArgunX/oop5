package com.example.uny.service;

import com.example.uny.model.Db.DataBase;
import com.example.uny.model.impl.Student;
import com.example.uny.model.impl.Teacher;

import java.util.List;

public class TeacherService implements UserService<Teacher> {




    @Override
    public Teacher createUser(String name, String lastName, int groupId) {
        int id;
        int size = DataBase.teachersDb.size();
        if (size ==0){
            id = 1;

        } else{
            id = size+1;
        }
        Teacher teacher = new Teacher(id,name,lastName);
        try{
            getBuyIdgroup(groupId);
        } catch (Exception e){
            System.out.println("Выполняется проверка по номеру группы....");
            System.out.println(e.getMessage());
            teacher.addGroupId(groupId);
            DataBase.teachersDb.add(teacher);
            System.out.println("Учитель создан успешно");
            return teacher;
        }
        System.out.println("Учитель с таким номером группы уже существует");
        System.out.println("Попробуйте создать учителя с другим номером группы.");
        return null;
    }

    @Override
    public List<Teacher> getAllUsers() {
        return DataBase.teachersDb;
    }

    @Override
    public Teacher getBuyId(int id) throws Exception {
        Teacher teacher = DataBase.teachersDb
                .stream()
                .filter(t -> t.getId()==id)
                .findFirst()
                .orElse(null);
        if (teacher == null){
            throw new Exception("Teacher not found");
        }
        return teacher;
    }


    public Teacher getBuyIdgroup(int groupId) throws Exception {
        Teacher teacher = DataBase.teachersDb
                .stream()
                .filter(g -> g.getGroups().contains(groupId))
                .findFirst()
                .orElse(null);
        if (teacher == null){
            throw new Exception("Group not found");
        }
        return teacher;
    }
    public void addGroupId(Teacher teacher, int groupId) {
       try {
           Teacher teacher1 = getBuyIdgroup(groupId);
           System.out.println("Группа уже прикреплена к учителю "+ teacher1);
       } catch (Exception e){

        teacher.addGroupId(groupId);
           System.out.println("Группа успешно добавлена: "+ teacher);
       }


    }
}
