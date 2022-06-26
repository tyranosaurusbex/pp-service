package com.pp.rest;

import com.pp.model.dto.UserDto;
import com.pp.model.entity.User;
import com.pp.services.UserMapper;
import com.pp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping()
    public List<User> getAllUsers() {
        return new ArrayList<>();
    }
    @PostMapping("/user")
    public UserDto createUser(@RequestBody final UserDto userDto) {
        User user = userMapper.toUser(userDto);
       return userMapper.toUserDto(userService.createUser(user));
    }
    @PutMapping("/user/{id}")
    public void updateUser(@RequestBody final UserDto userDto) {
        //
    }
}
