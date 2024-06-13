package com.example.uny.view;

import com.example.uny.Controller.UserController;
import com.example.uny.model.User;

import java.util.List;

 interface UserView<T extends User> {

     T createUser();
     T getById();
     List<T> getAllUsers() ;
     //Не стал реализовывать

 }
