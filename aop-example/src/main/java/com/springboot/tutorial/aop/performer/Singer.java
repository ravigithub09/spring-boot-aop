package com.springboot.tutorial.aop.performer;

import org.springframework.stereotype.Component;

import com.springboot.tutorial.aop.audiance.TurnAroundTime;

@Component
public class Singer {
	@TurnAroundTime
	public void perform() {
		System.out.println("Sing a song");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
