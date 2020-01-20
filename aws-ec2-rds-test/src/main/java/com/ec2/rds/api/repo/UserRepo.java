/*
 * @UserRepo.java	@Jan 17, 2020
 *
 * Copyright (c) 2013 Year Up. 
 * All rights reserved. 
 * 
 * No part of this document may be reproduced or transmitted in any form or by 
 * any means, electronic or mechanical, whether now known or later invented, 
 * for any purpose without the prior and express written consent of Year Up 
 * 
 */
package com.ec2.rds.api.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ec2.rds.api.entity.User;

/**
 * <p>
 * </p>
 *
 * @author Bhabani.behera
 * @version 1.0s
 *
 */
public interface UserRepo extends JpaRepository<User, Serializable> {

}
