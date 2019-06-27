package com.springboot.tutorial.aop.audiance;

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
public class Authenticate {
	
	@Pointcut("execution(** com.springboot.tutorial.aop.performer.*.*(..))")
	public void performance() {}
	
	@Before("execution(** com.springboot.tutorial.aop.performer.*.*(..))")
	public void authorizationCheck() {
		System.out.println("Check for authorization");
	}
	
	
	//@Around("execution(** com.springboot.tutorial.aop.performer.*.*(..)) && @annotation(TurnAroundTime)")
	@Around("execution(** com.springboot.tutorial.aop.performer.*.*(..)) && @annotation(TurnAroundTime)")
	public void watchPerformance(ProceedingJoinPoint jp) {
		Instant start = Instant.now();
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//jp.
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis(); 
		System.out.println("Total Turnaround time:"+timeElapsed);
	}
	
	

}
