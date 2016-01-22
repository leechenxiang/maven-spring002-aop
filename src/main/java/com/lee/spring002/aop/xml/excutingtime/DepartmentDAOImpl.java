package com.lee.spring002.aop.xml.excutingtime;


public class DepartmentDAOImpl implements IDepartmentDAO {

	@Override
	public String saveDepartment() throws InterruptedException {
		Thread.sleep(1000);
		return "saveDepartment successfully";
	}

	@Override
	public String updateDepartment() throws InterruptedException {
		Thread.sleep(1010);
		return "updateDepartment successfully";
	}

	@Override
	public String deleteDepartment() throws InterruptedException {
		Thread.sleep(1030);
		return "deleteDepartment successfully";
	}

	@Override
	public String getDepartment() throws InterruptedException {
		Thread.sleep(1040);
		return "getDepartment successfully";
	}

}
