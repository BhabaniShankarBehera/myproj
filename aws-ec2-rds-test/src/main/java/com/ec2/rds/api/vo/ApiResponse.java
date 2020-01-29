/*
 * @ApiResponse.java	@Jan 28, 2020
 *
 * Copyright (c) 2013 Year Up. 
 * All rights reserved. 
 * 
 * No part of this document may be reproduced or transmitted in any form or by 
 * any means, electronic or mechanical, whether now known or later invented, 
 * for any purpose without the prior and express written consent of Year Up 
 * 
 */
package com.ec2.rds.api.vo;


/**
 * <p>
 * </p>
 *
 * @author Bhabani.behera
 * @version 1.0
 *
 */
public class ApiResponse {
	private String message;
	private Object data;
	
	
	
	/**
	 * <p>
	 * </p>
	 *
	 * @param message
	 * @param data
	 */
	public ApiResponse(String message, Object data) {

		super();
		this.message = message;
		this.data = data;
	}

	/**
	 * <p>
	 * </p>
	 *
	 * @param data
	 */
	public ApiResponse(Object data) {

		super();
		this.data = data;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
	
		return message;
	}
	
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
	
		this.message = message;
	}
	
	/**
	 * @return the data
	 */
	public Object getData() {
	
		return data;
	}
	
	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
	
		this.data = data;
	}
	
	

}
