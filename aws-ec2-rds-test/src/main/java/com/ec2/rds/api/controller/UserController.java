/*
 * @UserController.java	@Jan 22, 2020
 *
 * Copyright (c) 2013 Year Up. 
 * All rights reserved. 
 * 
 * No part of this document may be reproduced or transmitted in any form or by 
 * any means, electronic or mechanical, whether now known or later invented, 
 * for any purpose without the prior and express written consent of Year Up 
 * 
 */
package com.ec2.rds.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ec2.rds.api.repo.UserRepo;

/**
 * <p>
 * </p>
 *
 * @author Bhabani.behera
 * @version 1.0
 *
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserRepo userRepo;

	@GetMapping(value = "/getusers")
	public HttpEntity<Object> getUser(){
		userRepo.findAll().stream().forEach(user -> logger.info("User Name : {} ,User Email : {}",user.getName(),user.getEmail()));
		return new ResponseEntity<>(userRepo.findAll(),HttpStatus.OK);
	}

}
