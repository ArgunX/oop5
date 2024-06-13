package com.example.uny.model;

import java.util.ArrayList;
import java.util.List;

public abstract class UserGroup<T extends User, T1 extends User> {
    protected T user;
    protected List<T1> users;

    public UserGroup(T user, List<T1> users) {
        this.user = user;
        this.users = users;
    }

    @Override
    public String toString() {
        return "Group {" +
                 user +
                "," + users +
                '}'+ "\n";
    }

    public List<T1> getUsers() {
        return users;
    }

    public T getUser() {
        return user;
    }
    public void addUser(T1 user){
        users.add(user);
    }

}

