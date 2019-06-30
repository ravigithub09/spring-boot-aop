package com.springboot.tutorial.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.tutorial.aop.TurnAroundTime;
import com.springboot.tutorial.aop.repository.RepositoryConfig;
import com.springboot.tutorial.aop.repository.RepositoryA;

@Component
public class BusinessLogic {
	
	@Autowired
	RepositoryConfig repositoryConfig;
	
	@Autowired
	RepositoryA repositoryA;
	
	@TurnAroundTime
	public void write(Repository repository) {
		switch(repository){
		case REPOSITORYA:
			repositoryConfig.writeToCollectionA();
			break;
		case REPOSITORYB:
			repositoryA.writeToCollectionB();
			break;
				
		}
	}
	
	public void read(Repository repository) {
		switch(repository){
		case REPOSITORYA:
			repositoryConfig.readFromCollectionA();
			break;
		case REPOSITORYB:
			repositoryA.readFromCollectionB();
			break;
				
		}
	}
}
