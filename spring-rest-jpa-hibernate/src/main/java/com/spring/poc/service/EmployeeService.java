package com.spring.poc.service;

import java.util.List;

import com.spring.poc.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();
	
	public Employee getEmployee(String code);

	public void createEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public void removeEmployee(String code);
	
}
