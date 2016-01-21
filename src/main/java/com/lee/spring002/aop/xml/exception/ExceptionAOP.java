package com.lee.spring002.aop.xml.exception;

import org.aspectj.lang.JoinPoint;

/**
 * 这是个切面
 * 
 * @author leechenxiang
 * @date 2016年1月12日
 *
 */
public class ExceptionAOP {
	
	public void authority(JoinPoint jp) {
		Object[] o = jp.getArgs();
		for ( int i = 0 ; i < o.length ; i ++) {
			System.out.println(o[i].toString());
		}
	}
	
	public void catchException(JoinPoint jp, Throwable content) {
		System.out.println("exception: " + content);
		System.out.println("exception: " + content.getMessage());
	}
	
}
