package com.company.product.interceptor;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class SecurityInterceptor implements Interceptor  {

	public void destroy() {
		
	}

	public void init() {
		System.out.println("In interceptor");
	}

	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("In interceptor");
		return null;
	}
	
}
