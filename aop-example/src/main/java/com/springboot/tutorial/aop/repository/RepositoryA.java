package com.springboot.tutorial.aop.repository;

import org.springframework.stereotype.Component;

import com.springboot.tutorial.aop.TurnAroundTime;

@Component
public class RepositoryA {
	
	public void readFromCollectionB() {
		System.out.println("Reading from collectionB");
	}
	
	public void writeToCollectionB() {
		System.out.println("Writing to collectionB");
	}

}
