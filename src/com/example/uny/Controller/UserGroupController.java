package com.example.uny.Controller;

import com.example.uny.model.User;
import com.example.uny.model.UserGroup;
import java.util.List;

public interface UserGroupController<T extends UserGroup,T1 extends User,T2 extends User> {

    List<T> createUserGroup(T1 user);
    List<T> getAllUserGroup();


}
