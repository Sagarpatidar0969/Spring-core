package com.rays.scope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrototypeScope {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("prototype.xml");

		UserService userService1 = (UserService) context.getBean("userService");

		UserService userService2 = (UserService) context.getBean("userService");

		System.out.println(userService1 == userService2); // Output: false (Different Instances)
	}
}