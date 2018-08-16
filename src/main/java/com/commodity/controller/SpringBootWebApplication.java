package com.commodity.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*@SpringBootApplication(scanBasePackages = {"com.commodity", "com.commodity.domain","com.commodity.services"})    
@ComponentScan("com.commodity")*/

@SpringBootApplication
@ComponentScan({"com.commodity"}) 
@EntityScan("com.commodity.domain")
@EnableJpaRepositories("com.commodity.domain.repository")
public class SpringBootWebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootWebApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

}