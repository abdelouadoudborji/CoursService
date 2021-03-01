package com.cours.CoursService.CoursService.entities;

import com.cours.CoursService.CoursService.model.Client;
import com.cours.CoursService.CoursService.model.Coach;
import com.cours.CoursService.CoursService.model.Sport;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Set;

@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
@Data
public class Cours {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date datecours;
    private Time duree;
    private String urlcours;
    private Long SportID;
    private Long CoachID;
    private Long ClientID;

    @Transient
    private Sport sport;
    @Transient
    private Coach coach;
    @Transient
    private Client client;

}