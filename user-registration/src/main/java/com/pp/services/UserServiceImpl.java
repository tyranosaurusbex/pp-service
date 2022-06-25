package com.pp.services;

import com.pp.model.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void createUser(User user) {
        // call db
    }
}
