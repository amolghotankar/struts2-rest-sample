package com.company.product.rest;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository {
	private static Map<String,Employee> map = new HashMap<String,Employee>(); 
	public EmployeeRepository(){
		map.put("111", new Employee(111, "Ram", "ABC"));
		map.put("222", new Employee(222, "Shyam", "EFG"));
		map.put("333", new Employee(333, "Mohan", "XYZ"));
	}
	public  Employee getEmployeeById(String id){
		return map.get(id);
	}
	public  Map<String,Employee> findAllEmployee(){
		return map;
	}
}
