package com.techprimers.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SpringBootMysqldbApplication {

	public static void main(String[] args) {

	ConfigurableApplicationContext context = SpringApplication.run(SpringBootMysqldbApplication.class, args);

	}
}
