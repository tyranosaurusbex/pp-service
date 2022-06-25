package com.pp.rest;

import com.pp.model.dto.UserDto;
import com.pp.model.entity.User;
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

    @GetMapping()
    public List<User> getAllUsers() {
        return new ArrayList<>();
    }
    @PostMapping("/user")
    public void createUser(@RequestBody final UserDto userDto) {
        //
    }
    @PutMapping("/user/{id}")
    public void updateUser(@RequestBody final UserDto userDto) {
        //
    }
}
