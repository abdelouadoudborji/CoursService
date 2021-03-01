package com.cours.CoursService.CoursService.Feign;
import com.cours.CoursService.CoursService.model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CLIENT-SERVICE")//client-service
public interface ClientRestClient {
    @GetMapping(path="/clients/{id}")
    public Client getClientById(@PathVariable(name="id") Long id);

}
