/**
 * 
 */
package com.ec2.rds.api.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.ec2.rds.api.filter.CrossFilter;

/**
 * @author Bhabani.behera
 *
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.addFilterBefore(new CrossFilter(), UsernamePasswordAuthenticationFilter.class);
    }
}
