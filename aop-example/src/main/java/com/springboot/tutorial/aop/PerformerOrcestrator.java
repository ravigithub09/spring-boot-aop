package com.springboot.tutorial.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.tutorial.aop.performer.Guitarist;
import com.springboot.tutorial.aop.performer.Performer;
import com.springboot.tutorial.aop.performer.Singer;

@Component
public class PerformerOrcestrator {
	
	@Autowired
	Guitarist guitarist;
	
	@Autowired
	Singer singer;
	
	public void startPerformance(Performer performer) {
		//guit.perform();
		//if(performer.)
		switch(performer){
		case SINGER:
			singer.perform();
			break;
		case GUITARIST:
			guitarist.perform();
			break;
				
		}
		//guit.perform();
	}

}
