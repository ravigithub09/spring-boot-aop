package com.springboot.tutorial.aop.audiance;

import java.time.Duration;
import java.time.Instant;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

public class PerformanceCheck {
	
	//@Pointcut("execution(** com.springboot.tutorial.aop.performer.*.*(..))")
	@Pointcut("execution(** com.springboot.tutorial.aop.performer.*.*(..)) && @annotation(TurnAroundTime)")
	public void performance() {}
	
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
