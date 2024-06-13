package com.example.uny.model.Db;

import com.example.uny.model.impl.Student;
import com.example.uny.model.impl.StudentGroup;
import com.example.uny.model.impl.Teacher;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class DataBase {
    public static final List<Student> studentsDb = new ArrayList<>();
    public static final List<Teacher> teachersDb = new ArrayList<>();
    public static final List<StudentGroup> studentGroupDb = new ArrayList<>();

    public static void fillDb(){
        Teacher teacher = new Teacher(1,"Nikolay","Ivanov");
        teacher.addGroupId(1);
        teacher.addGroupId(2);
        teachersDb.add(teacher);
        Student student1 = new Student(1,"Petr","Sidorov",1);
        Student student2 = new Student(2,"Andrey","Taraskin",1);
        Student student3 = new Student(3,"Andrey","Taraskin",1);
        Student student4 = new Student(4,"Dart","Waider",2);
        studentsDb.add(student1);
        studentsDb.add(student2);
        studentsDb.add(student3);
        studentsDb.add(student4);
        StudentGroup studentGroup = new StudentGroup(teacher,List.of(student1,student2,student3));
        studentGroupDb.add(studentGroup);


    }
}
