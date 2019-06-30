package com.springboot.tutorial.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.tutorial.aop.business.Repository;
import com.springboot.tutorial.aop.repository.RepositoryA;
import com.springboot.tutorial.aop.business.BusinessLogic;


@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan("com.springboot.tutorial.aop.business")
public class AOPTest {
	
	
	@Autowired
	BusinessLogic businessLogic;
	
	@Autowired
	RepositoryA repositoryA;
	
	@Test
	public void writeTestRepositoryAPositive() {
		Session.setUserId("ADMIN");
		businessLogic.write(Repository.REPOSITORYA);
	}
	
	@Test
	public void writeTestRepositoryANegative() {
		Session.setUserId("USR1234");
		businessLogic.write(Repository.REPOSITORYA);
	}
	
	@Test
	public void writeTestRepositoryB() {
		businessLogic.read(Repository.REPOSITORYB);
	}
	
	

}
