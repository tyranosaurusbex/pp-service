package com.pp.model.dto;

import lombok.Data;

import java.util.Date;
@Data
public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String company;
    private String email;
    private String country;
    private Boolean state;

}
