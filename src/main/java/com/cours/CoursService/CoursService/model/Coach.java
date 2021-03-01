package com.cours.CoursService.CoursService.model;

import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class Coach {

    private Long id;

    private String Code;
    private String photo;
    private String description;

    private String first_name;

    private String last_name;
    private Date birthday;

    private String email;
    private String phonenumber;

    private String address;

    private Set<Sport> SportsList ;
}
