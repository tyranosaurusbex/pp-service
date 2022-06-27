package com.pp.rest;

import com.pp.model.dto.UserDto;
import com.pp.model.entity.User;
import com.pp.services.UserMapper;
import com.pp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping()
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers()
                .stream().map(user -> userMapper.toUserDto(user))
                .collect(Collectors.toList());
    }
    @PostMapping("/user")
    public UserDto createUser(@RequestBody final UserDto userDto) {
        User user = userMapper.toUser(userDto);
       return userMapper.toUserDto(userService.createUser(user));
    }
    @PutMapping("/user/{id}")
    public void updateUser(@PathVariable("id") final Long id, @RequestBody final UserDto userDto) {
        userService.updateUser(id, userMapper.toUser(userDto));
    }
    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable("id") final Long id) {
        return userMapper.toUserDto(userService.getUserById(id));
    }
}
