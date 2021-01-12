package com.zypp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan({"com.zypp.controller","com.zypp.service"})
public class SpringbootCrudRestfuWebservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudRestfuWebservice2Application.class, args);
	}

}
