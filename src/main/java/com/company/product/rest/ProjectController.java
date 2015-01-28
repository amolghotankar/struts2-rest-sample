package com.company.product.rest;
import java.util.Map;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.ValidationAware;

public class ProjectController extends ActionSupport implements ModelDriven<Object>,ValidationAware {
	private static final long serialVersionUID = 1L;
	private String id;
	private Object model;
	private EmployeeRepository employeeRepository = new EmployeeRepository();
	private static Map<String,Employee> map;
	{
		map = employeeRepository.findAllEmployee();
	}
	
	public void validateIndex() {
		System.out.println("hi");
	}
	
	public HttpHeaders index() {
		model = map;
		return new DefaultHttpHeaders("index").disableCaching();
	}
	
	public void validateCreate() {
		System.out.println("hi");
	}

	public String create() {
		System.out.println("hi");
		return "SUCCESS" ;		
	}
	
	public void validateUpdate() throws Exception {
		System.out.println("hi");
		addActionError("status");
	}
	
	public String update(){
		System.out.println("hi");
		return "SUCCESS";
	}
	
	public String destroy() {
		System.out.println("hi");
		return "SUCCESS" ;		
	}

	public void validateShow() {
		System.out.println("hi");
	}
	
	public String show() {
		System.out.println("hi");
		return "SUCCESS" ;
	}
	
	public String edit() {
		System.out.println("hi");
		return "SUCCESS" ;		
	}
	
	public void validateLogin() {
		System.out.println("hi");
	}
	
	public String login() {
		System.out.println("hi");
		return "SUCCESS" ;		
	}

	public String editNew() {
		System.out.println("hi");
		return "SUCCESS" ;		
	}
	public String getId() {
		return id;
	}
		
	public void setId(String id) {
		model = employeeRepository.getEmployeeById(id);
		this.id = id;
	}
	
	public Object getModel() {
		return model;
	}
}
