package com.lee.spring003.aop.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {

	@Test
	public void testPerson() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-scan-aop.xml");
		ITeacherDAO tDAO = (ITeacherDAO)context.getBean("teacherDAO");
		tDAO.saveTeacher();
	}

}
