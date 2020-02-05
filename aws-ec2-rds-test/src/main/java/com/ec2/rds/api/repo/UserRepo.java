/*
 * @UserRepo.java	@Jan 17, 2020
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
