package com.lee.spring002.aop.xml.excutingtime;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 这是个切面
 * 
 * @author leechenxiang
 * @date 2016年1月12日
 *
 */
public class TimeAOP {
	
	public void excutingTime(ProceedingJoinPoint point) throws Throwable {
		long begin = System.currentTimeMillis();
		Object result = point.proceed();
		long took = System.currentTimeMillis() - begin;
		System.out.println(took);
	}
}
