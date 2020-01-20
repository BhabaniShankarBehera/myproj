/*
 * @User.java	@Jan 17, 2020
 *
 * Copyright (c) 2013 Year Up. 
 * All rights reserved. 
 * 
 * No part of this document may be reproduced or transmitted in any form or by 
 * any means, electronic or mechanical, whether now known or later invented, 
 * for any purpose without the prior and express written consent of Year Up 
 * 
 */
package com.ec2.rds.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>
 * </p>
 *
 * @author Bhabani.behera
 * @version 1.0
 *
 */
@Entity(name="user")
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
	
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
	
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
	
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
	
		this.name = name;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
	
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
	
		this.email = email;
	}
	
	

}
