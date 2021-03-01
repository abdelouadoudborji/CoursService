package com.cours.CoursService.CoursService;


import com.cours.CoursService.CoursService.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
@EnableFeignClients
@SpringBootApplication
public class CoursServiceApplication {



	public static void main(String[] args) {
		SpringApplication.run(CoursServiceApplication.class, args);
	}

}
