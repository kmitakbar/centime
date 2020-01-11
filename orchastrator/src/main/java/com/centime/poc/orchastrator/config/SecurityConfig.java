package com.centime.poc.orchastrator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import com.centime.audit.AuditLogAspect;


  @Configuration public class SecurityConfig extends
  WebSecurityConfigurerAdapter {
  
  @Bean AuditLogAspect auditLogAspect() { return new AuditLogAspect(); }
  
  @Override protected void configure(HttpSecurity http) throws Exception {
  http.csrf().disable().authorizeRequests().antMatchers("/api/up").permitAll().
  anyRequest().authenticated().and().httpBasic().and()
  .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
  }
  
  @Override protected void configure(AuthenticationManagerBuilder auth) throws
  Exception {
  auth.inMemoryAuthentication().withUser("akbar").password("{noop}akbar").roles
  ("USER").and().withUser("admin")
  .password("{noop}admin").credentialsExpired(true).accountExpired(true).
  accountLocked(true) .authorities("WRITE_PRIVILEGES",
  "READ_PRIVILEGES").roles("ADMIN"); } }
 