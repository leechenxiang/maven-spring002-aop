package com.lee.spring002.aop.xml;

public class PersonDAOImpl implements IPersonDAO {

	@Override
	public String savePerson() {
		System.out.println("PersonDAOImpl - savePerson()");
		
//		int a = 1 / 0;
		
		return "save successfully";
	}

}
