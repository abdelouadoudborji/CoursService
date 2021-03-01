package com.cours.CoursService.CoursService.dao;

import com.cours.CoursService.CoursService.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="cours")
public interface CoursRepository extends JpaRepository<Cours,Long> {
}
