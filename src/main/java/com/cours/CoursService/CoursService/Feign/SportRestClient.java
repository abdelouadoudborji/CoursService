package com.cours.CoursService.CoursService.Feign;
import com.cours.CoursService.CoursService.model.Sport;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//@FeignClient(name = "COACH-SERVICE")
public interface SportRestClient {
    @GetMapping(path="/sports/{id}")
    public Sport getSportById(@PathVariable(name="id") Long id);
}
