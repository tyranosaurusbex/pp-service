package com.pp.services;

import com.pp.model.entity.User;
import com.pp.persistence.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserServiceImpl userService;
    @Test
    public void testCreateUser() {
        // setup
        User user = new User();
        // method under test
        this.userService.createUser(user);
        // verify
        verify(userRepository, times(1)).save(user);
    }
}
