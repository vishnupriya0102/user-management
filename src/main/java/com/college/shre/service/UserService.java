package com.college.shre.service;

import java.util.List;
import com.college.shre.entity.User;

public interface UserService {
    User createUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
    List<User> getUsers();
}