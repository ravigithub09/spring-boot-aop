package com.springboot.tutorial.aop.repository;

import org.springframework.stereotype.Component;

@Component
public class RepositoryConfig {

	public void readFromCollectionA() {
		System.out.println("Reading from collectionA");
	}
	
	public void writeToCollectionA() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Writing to collectionA");
	}

}
