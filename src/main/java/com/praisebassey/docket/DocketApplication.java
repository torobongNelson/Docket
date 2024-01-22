package com.praisebassey.docket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.praisebassey.docket.Repositories")
public class DocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocketApplication.class, args);
	}

}
