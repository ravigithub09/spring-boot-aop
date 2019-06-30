package com.springboot.tutorial.aop;

public class Authorization {
	public static boolean isAuthorised(String userId) {
		if(Session.getUserId()=="ADMIN") {
			return true;
		}
		return false;
	}

}
