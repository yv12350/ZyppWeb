package com.zypp.service;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public BCryptPasswordEncoder bcryptencoder;

	@Autowired
	public DataSource datasource;

	@Value("${spring.queries.user-query}")
	public String userQuery;

	@Value("${spring.queries.role-query}")
	public String rolesQuery;

	
	  public void configure(AuthenticationManagerBuilder auth)throws Exception {
	  System.out.println("Hello world");
	  auth.jdbcAuthentication().usersByUsernameQuery(userQuery).authoritiesByUsernameQuery(rolesQuery).
	 
	  dataSource(datasource).passwordEncoder(bcryptencoder);
	  
	  }
	 
	@Override
	public void configure(HttpSecurity http) throws Exception {
		/*
		 * http .authorizeRequests() .anyRequest().authenticated() .and() .formLogin()
		 * .loginPage("/login") .permitAll();
		 */   
		
		  http.authorizeRequests().
		  
			
			  antMatchers("/teacher/**").permitAll().
			 antMatchers("/student/**").permitAll() .
			 antMatchers("/register/**").permitAll().
			 antMatchers("/login/**").permitAll().
		  anyRequest().authenticated() .and()
		  
		  .csrf().disable().formLogin().loginPage("/login/student")
		  .usernameParameter("emailid").passwordParameter("password").and()
		  .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		  .invalidateHttpSession(true) .clearAuthentication(true)
		  .logoutSuccessUrl("/").and().exceptionHandling();
		 

	}
	
	  @Override
	  
	  public void configure(WebSecurity Web) throws Exception {
	  Web.ignoring().antMatchers("/resources/**");
	  
	  
	  }
	 

}
