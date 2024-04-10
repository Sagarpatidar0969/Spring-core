package com.rays.autowire.byname;

import com.rays.autowire.notype.UserDao;

public class UserDaoImpl implements UserDao {

	public void add() {
		System.out.println("add method..!!!");
	}

}
