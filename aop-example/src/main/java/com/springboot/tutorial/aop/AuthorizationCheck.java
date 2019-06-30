package com.springboot.tutorial.aop;

import java.time.Duration;
import java.time.Instant;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Aspect
@Configuration
public class AuthorizationCheck {
	
	@Around("execution(** com.springboot.tutorial.aop.repository.RepositoryConfig.*(..))")
	public void watchPerformance(ProceedingJoinPoint jp) {
		
		try {
			if(Authorization.isAuthorised(Session.getUserId())) {
				jp.proceed();
			}
			else {
				System.out.println("User not Authorised");
			}
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
	}

}
