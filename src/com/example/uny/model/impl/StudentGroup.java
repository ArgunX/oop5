package com.example.uny.model.impl;

import com.example.uny.model.UserGroup;

import java.util.Comparator;
import java.util.List;

public class StudentGroup extends UserGroup<Teacher,Student> {

    public StudentGroup(Teacher user, List<Student> users) {
        super(user, users);
    }

}
