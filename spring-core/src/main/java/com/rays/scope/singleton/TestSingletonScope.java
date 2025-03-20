package com.rays.scope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSingletonScope {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("singleton.xml");

		UserService userService1 = (UserService) context.getBean("userService");

		UserService userService2 = (UserService) context.getBean("userService");

		System.out.println(userService1 == userService2); // true (Same Instance)
	}
}