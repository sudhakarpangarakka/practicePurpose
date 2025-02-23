package com.slokam.rest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class RestApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestApp1Application.class, args);
	}
      
}
