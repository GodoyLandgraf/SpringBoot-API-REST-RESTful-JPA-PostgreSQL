package com.spring.rest.api.SpringRestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EntityScan(basePackages = {"com.spring.rest.api.SpringRestAPI.model"})
@ComponentScan(basePackages = {"com.*"} )
@EnableJpaRepositories(basePackages = {"com.spring.rest.api.SpringRestAPI.repository"})
@EnableTransactionManagement
@EnableWebMvc
@RestController
@EnableAutoConfiguration
public class SpringRestApiApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiApplication.class, args);
	}

	/* Configuração global(centralizada) do Cross Origin que reflete em todo o sistema*/
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/usuario/**").allowedMethods("POST", "PUT", "DELETE", "GET")
		.allowedOrigins("www.cliente40.com.br");
		;
		//Liberando requisições POST, PUT , DELETE E GET PARA DO CONTROLLER /usuario/** Somente para o www.cliente40.com.br
	}
	
}
