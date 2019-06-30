package com.springboot.tutorial.aop;

import java.time.Duration;
import java.time.Instant;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
@Aspect
@Configuration
public class PerformanceCheck {
	
	@Around("execution(** com.springboot.tutorial.aop.*.*.*(..)) && @annotation(TurnAroundTime)")
	public void watchPerformance(ProceedingJoinPoint jp) {
		Instant start = Instant.now();
		try {
			jp.proceed();
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		Instant finish = Instant.now();
		long timeElapsed = Duration.between(start, finish).toMillis(); 
		System.out.println("Total Turnaround time:"+timeElapsed);
	}

}
