package com.lee.spring002.aop.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {

	/**
	 * 原理：
	 *    1、当spring容器启动的时候，加载两个bean,对两个bean进行实例化
	 *    2、当spring容器对配置文件解析到<aop:config>的时候
	 *    3、把切入点表达式解析出来，按照切入点表达式匹配spring容器内容的bean
	 *    4、如果匹配成功，则为该bean创建代理对象
	 *    5、当客户端利用context.getBean获取一个对象时，如果该对象有代理对象，则返回代理对象
	 *         如果没有代理对象，则返回对象本身
	 */
	@Test
	public void testPerson() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IPersonDAO personDAO = (IPersonDAO)context.getBean("personDAO");
		personDAO.savePerson();
	}

}
