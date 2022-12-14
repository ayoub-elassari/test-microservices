package com.example.cloudgateaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
//@EnableHystrix
public class CloudGateawayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGateawayApplication.class, args);
	}

}
