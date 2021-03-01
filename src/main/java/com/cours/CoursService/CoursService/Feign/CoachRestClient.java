package com.cours.CoursService.CoursService.Feign;

import com.cours.CoursService.CoursService.model.Coach;
import com.cours.CoursService.CoursService.model.Sport;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "COACH-SERVICE")
public interface CoachRestClient {
    @GetMapping(path="/coachs/{id}")
    public Coach getCoachById(@PathVariable(name="id") Long id);
    @GetMapping(path="/sports/{id}")
    public Sport getSportById(@PathVariable(name="id") Long id);
}
