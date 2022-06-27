package com.pp.services;

import com.pp.model.entity.User;

import java.util.List;

public interface UserService {
    /**
     * Creates new user
     * @param user User to save
     * @return saved user
     */
    User createUser(User user);

    /**
     * Gets all users
     * @return returns list of users
     */
    List<User> getAllUsers();

    /**
     * Updates user
     * @param id user id
     * @param user updated user
     */
    void updateUser(Long id, User user);

    /**
     * Get user by id
     * @param id user id
     * @return returns user
     */
    User getUserById(Long id);
}
