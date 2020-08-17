package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.cg.hcs.dao")
public class HealthCareSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(HealthCareSystemApplication.class, args);
	}

}
