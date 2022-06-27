package com.pp.services;

import com.pp.model.entity.User;
import com.pp.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public void updateUser(Long id, User updatedUser) {
        User user = this.userRepository.findById(id).orElse(null);

        if(Objects.nonNull(user)) {
            user.setFirstName(updatedUser.getFirstName());
            user.setLastName(updatedUser.getLastName());
            user.setDateOfBirth(updatedUser.getDateOfBirth());
            user.setCompany(updatedUser.getCompany());
            user.setEmail(updatedUser.getEmail());
            user.setCountry(updatedUser.getCountry());
            user.setState(updatedUser.getState());

            this.userRepository.save(user);
        }
    }

    @Override
    public User getUserById(Long id) {
        return this.userRepository.findById(id).orElse(null);
    }
}
