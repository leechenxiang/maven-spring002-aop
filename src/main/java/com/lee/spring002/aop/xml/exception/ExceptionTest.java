package com.lee.spring002.aop.xml.exception;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExceptionTest {

	@Test
	public void testStu() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStuService stuService = (IStuService)context.getBean("stuService");
//		stuService.saveStu();
//		stuService.getStu();
	}

	@Test
	public void testStu2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStu2Service stu2Service = (IStu2Service)context.getBean("stu2Service");
		stu2Service.saveStu();
	}
	
	@Test
	public void testAuthority() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStuService stuService = (IStuService)context.getBean("stuService");
		stuService.login("lee");
	}
}
