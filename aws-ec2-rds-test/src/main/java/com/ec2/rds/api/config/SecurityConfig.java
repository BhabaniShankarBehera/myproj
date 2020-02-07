/**
 * 
 */
package com.ec2.rds.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;

import com.ec2.rds.api.filter.CrossFilter;

/**
 * @author Bhabani.behera
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private CrossFilter crossFilter;
	private static final String[] API_PATH = new String[] { "/api/v1/*" };

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers(API_PATH).permitAll().anyRequest().authenticated();
		http.cors();
		http.addFilterBefore(crossFilter, ChannelProcessingFilter.class);
		http.csrf().disable();
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
}
