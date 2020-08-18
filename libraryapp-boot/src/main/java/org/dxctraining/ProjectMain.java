package org.dxctraining;

import org.dxctraining.author.dao.IAuthorDao;
import org.dxctraining.author.services.AuthorServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class ProjectMain {

	public static void main(String[] args) 
	{
		SpringApplication.run(ProjectMain.class, args);
	}
}