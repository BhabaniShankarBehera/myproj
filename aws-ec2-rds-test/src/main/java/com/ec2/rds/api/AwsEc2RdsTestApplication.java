package com.ec2.rds.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ec2.rds.api.repo.UserRepo;

@SpringBootApplication
public class AwsEc2RdsTestApplication implements CommandLineRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(AwsEc2RdsTestApplication.class);

	@Autowired
	private UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(AwsEc2RdsTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		userRepo.findAll().stream().forEach(user -> logger.info("User Name : {} ,User Email : {}",user.getName(),user.getEmail()));
		
	}

}
