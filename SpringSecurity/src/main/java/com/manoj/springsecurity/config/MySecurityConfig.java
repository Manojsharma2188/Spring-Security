package com.manoj.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	MyAuthProvided myAuthProvided;
	
	/*
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception { InMemoryUserDetailsManager inMemoryUserDetailsManager = new
	 * InMemoryUserDetailsManager(); UserDetails user =
	 * User.withUsername("manoj").password(bCryptPasswordEncoder.encode("123")).
	 * authorities("read").build();
	 * 
	 * inMemoryUserDetailsManager.createUser(user);
	 * 
	 * auth.userDetailsService(inMemoryUserDetailsManager);
	 * 
	 * }
	 */
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.authenticationProvider(myAuthProvided);
 
	}

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.httpBasic();
		http.authorizeRequests().antMatchers("/login").authenticated();
		http.addFilterBefore(new SecurityFilter(), BasicAuthenticationFilter.class);

	}
	
	@Bean
	public BCryptPasswordEncoder getBCryptPasswordEncoder()
	{
		return new BCryptPasswordEncoder();
	}

}
