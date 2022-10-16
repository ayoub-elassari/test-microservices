package com.example.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@Bean
	/*
	*had @LoadBalanced ila drna localhost:9001 makan7tajohach
	* getForObject("http://localhost:9001/departments/" +
                                user.getDepartmentId(),
                        Department.class);*/
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
