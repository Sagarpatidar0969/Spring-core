package com.rays.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultipleXML {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "user.xml", "person.xml" });

		User user = (User) context.getBean("user"); // context.getBean(UserBean.class);

		Person person = (Person) context.getBean("person"); // context.getBean(Person.class);

		System.out.println("User Login: " + user.getLogin());

		System.out.println("User Password: " + user.getPassword());

		System.out.println("Person Name: " + person.getName());
	}
}