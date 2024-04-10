package com.rays.autowire.bytype;

public class EmployeService {
	
	private EmployeDao employeDao;

	public void setEmployeDao(EmployeDao employeDao) {
		this.employeDao = employeDao;
	}
	
	public void testIntface(){
		
		employeDao.intface();
		
	}

}
