package com.cours.CoursService.CoursService.web;

import com.cours.CoursService.CoursService.Feign.ClientRestClient;
import com.cours.CoursService.CoursService.Feign.CoachRestClient;
import com.cours.CoursService.CoursService.Feign.SportRestClient;
import com.cours.CoursService.CoursService.dao.CoursRepository;
import com.cours.CoursService.CoursService.entities.Cours;
import com.cours.CoursService.CoursService.model.Client;
import com.cours.CoursService.CoursService.model.Coach;
import com.cours.CoursService.CoursService.model.Sport;
import org.keycloak.adapters.springsecurity.KeycloakConfiguration;
import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CoursController {
    @Autowired
    private CoursRepository coursRepository;

@Autowired
    private KeycloakRestTemplate keycloakRestTemplate;





@GetMapping(path="/fullcours/{id}")
    public Cours getfullCours(@PathVariable(name = "id")  Long id){
        String urlcoach="http://localhost:8081/coachs/"+id;
    String urlsport="http://localhost:8081/sports/"+id;
    String urlclient="http://localhost:8083/clients/"+id;
    Coach coach =keycloakRestTemplate.getForObject(urlcoach,Coach.class);
    Cours cours =  coursRepository.findById(id).get();
    Sport sport = keycloakRestTemplate.getForObject(urlsport,Sport.class);
    Client client = keycloakRestTemplate.getForObject(urlclient,Client.class);
    cours.setCoach(coach);
    cours.setSport(sport);
    cours.setClient(client);
    return cours;
    }
}
