package com.pp.services;

import com.pp.model.dto.UserDto;
import com.pp.model.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public User toUser(UserDto dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setDateOfBirth(dto.getDateOfBirth());
        user.setCompany(dto.getCompany());
        user.setEmail(dto.getEmail());
        user.setCountry(dto.getCountry());
        user.setState(dto.getState());

        return user;
    }

    public UserDto toUserDto(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setDateOfBirth(user.getDateOfBirth());
        dto.setCompany(user.getCompany());
        dto.setEmail(user.getEmail());
        dto.setCountry(user.getCountry());
        dto.setState(user.getState());

        return dto;
    }

}
