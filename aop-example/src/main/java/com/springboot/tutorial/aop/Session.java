package com.springboot.tutorial.aop;

public class Session {
	
	private static String USERID;
	
	public static String getUserId() {
		return USERID;
	}
	
	public static void setUserId(String userid) {
		USERID=userid;
	}

}
