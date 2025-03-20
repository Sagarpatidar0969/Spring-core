package com.rays.child;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestChild {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("child.xml");

		Person person = (Person) context.getBean("person");

		System.out.println("name: " + person.getName());

		System.out.println("age: " + person.getAge());
	}
}