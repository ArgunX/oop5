package com.example.uny.Controller;

import com.example.uny.model.User;
import java.util.List;


public interface UserController<T extends User> {
    T createUser(String name,String lastName, int groupId);
    T getById (int id) ;
    List<T> getAllUsers();





}
