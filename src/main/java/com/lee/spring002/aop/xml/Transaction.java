package com.lee.spring002.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 这是个切面
 * 
 * @author leechenxiang
 * @date 2016年1月12日
 *
 */
public class Transaction {
	
	public void beginTransaction(JoinPoint jp) {
		System.out.println("连接点名称: " + jp.getSignature().getName());
		System.out.println("目标类名称: " + jp.getTarget().getClass());
		System.out.println("Begin transaction...");
	}
	
	/**
	 * 
	 * @param jp
	 * @param val 目标方法返回值，要与returning对应 
	 */
	public void commit(JoinPoint jp, Object val) {
		System.out.println("Transaction commit...");
		
		System.out.println("returning: " + val.toString());
	} 
	
	public void finallyDisplay() {
		System.out.println("finally...");
	}
	
	public void exception(JoinPoint jp, Throwable content) {
		System.out.println("exception: " + content);
		System.out.println("exception: " + content.getMessage());
	}
	
	public void arround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("arround...");
		pjp.proceed();	// 调用目标方法,如果这行不写，则目标方法不执行
	}
}
