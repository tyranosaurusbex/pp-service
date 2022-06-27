package com.pp.services;

import com.pp.model.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    List<User> getAllUsers();

    void updateUser(Long id, User user);

    User getUserById(Long id);
}
