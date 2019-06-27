package com.springboot.tutorial.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.tutorial.aop.performer.Performer;


@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan("com.springboot.tutorial.aop.audiance")
public class PerformerOrcestratorTest {
	
	
	@Autowired
	PerformerOrcestrator performerOrcestrator;
	
	@Test
	public void startGuitaristPerformanceTest() {
		performerOrcestrator.startPerformance(Performer.GUITARIST);
	}
	
	@Test
	public void startSingerPerformanceTest() {
		performerOrcestrator.startPerformance(Performer.SINGER);
	}
	

}
