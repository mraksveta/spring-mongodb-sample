package com.github.mraksveta.mongodb.demo.config;

import com.github.mraksveta.mongodb.demo.document.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("com.github.mraksveta.mongodb.demo")
@EnableMongoRepositories("com.github.mraksveta.mongodb.demo.repository")
public class MongoDBDemo {
    public static void main(String[] args) {
        SpringApplication.run(MongoDBDemo.class);
    }
}
