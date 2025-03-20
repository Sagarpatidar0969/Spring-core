package com.rays.scope.prototype;

public class UserService {

	public UserService() {
		System.out.println("Prototype UserService Created");
	}

	public String getUser() {
		return "Fetching user from User Service";
	}
}