package com.rays.scope.singleton;

public class UserService {

	public UserService() {
		System.out.println("Singleton UserService Created");
	}

	public String getUser() {
		return "Fetching user from User Service";
	}
}