package com.example.uny.model.impl;

import com.example.uny.model.User;

public class Student extends User {

    int groupId;

    public Student(int id, String name, String lastName, int groupId) {
        super(id, name, lastName);
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupId=" + groupId +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}'+ "\n";
    }

    public int getGroupId() {
        return groupId;
    }
}
