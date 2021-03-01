package com.cours.CoursService.CoursService.model;

import lombok.Data;

import java.util.Set;

@Data

public class Sport {

    private Long id;
    private String code;
    private String label;
    private String description;

    private Set<Coach> Coach;
}
