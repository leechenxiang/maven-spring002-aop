package com.lee.spring002.aop.xml.excutingtime;

public interface IDepartmentDAO {
	
	public String saveDepartment() throws InterruptedException;
	
	public String updateDepartment() throws InterruptedException;
	
	public String deleteDepartment() throws InterruptedException;
	
	public String getDepartment() throws InterruptedException;
	
}
