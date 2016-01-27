package com.lee.spring003.aop.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("transaction")
@Aspect
public class Transaction {
	
	@Pointcut("execution(* com.lee.spring003.aop.annotation.TeacherDAOImpl.*(..))")
	public void beginTransactionPointCut() {	// 方法签名
	};
	
	@Before("beginTransactionPointCut()")
	public void beginTransaction() {
		System.out.println("Begin transaction...");
	}
	
	@AfterReturning("beginTransactionPointCut()")
	public void commit() {
		System.out.println("Transaction commit...");
	} 
	
}
