package com.example.uny.model.impl;

import com.example.uny.model.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Teacher extends User {
   private final HashSet<Integer> groups;

    public Teacher(int id, String name, String lastName) {
        super(id, name, lastName);
        this.groups = new HashSet<>();
    }

    public HashSet<Integer> getGroups() {
        return groups;
    }

    public void addGroupId(int groupID) {
        groups.add(groupID);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "groups=" + groups +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}'+ "\n";
    }

}

