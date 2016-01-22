package com.lee.spring002.aop.xml.excutingtime;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TimeTest {


	@Test
	public void testStu2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IDepartmentService departmentService = (IDepartmentService)context.getBean("departmentService");
		try {
			departmentService.saveDepartment();
			departmentService.deleteDepartment();
			departmentService.getDepartment();
			departmentService.updateDepartment();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
