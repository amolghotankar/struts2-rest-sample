package com.company.product.interceptor;


import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

public class AccessAdvisor {
	public Object filter(ProceedingJoinPoint  thisJoinPoint) throws Throwable
	{
		Method m = ((MethodSignature)thisJoinPoint.getSignature()).getMethod();
		String c  = m.getDeclaringClass().getName().substring(m.getDeclaringClass().getName().lastIndexOf('.')+1 , m.getDeclaringClass().getName().length());
		System.out.println("*********************************" + m.getName());
		if(!(m.getName().startsWith("get") || m.getName().startsWith("set")))
		{	
			System.out.println("In filter");
		}
		return thisJoinPoint.proceed();
	}
	
}