package com.rays.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestUser {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("User.xml"));

		User user = (User) factory.getBean("user");

		System.out.println("User Login: " + user.getLogin());

		System.out.println("User Password: " + user.getPassword());
	}
}