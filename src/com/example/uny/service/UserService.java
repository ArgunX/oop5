package com.example.uny.service;

import com.example.uny.model.User;

import java.util.List;

public interface UserService <T extends User> {
    T createUser(String name, String lastName, int groupId);
    List<T> getAllUsers();
    T getBuyId(int id) throws Exception;


}
