package com.example.uny.service;

import com.example.uny.model.User;
import com.example.uny.model.UserGroup;
import com.example.uny.model.impl.Student;
import com.example.uny.model.impl.Teacher;


import java.util.LinkedHashMap;
import java.util.List;

public interface UserGroupService <T extends UserGroup, T1 extends User,T2 extends User> {


    List<T> createUserGroup(T1 teacher, List<T2> students) ;
    List<T> getAllUserGroup();
}
