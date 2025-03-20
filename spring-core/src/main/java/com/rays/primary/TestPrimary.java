package com.rays.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrimary {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("primary.xml");
		
		UserService userService = (UserService) context.getBean("userService");
		
		userService.testAdd();
	}
}