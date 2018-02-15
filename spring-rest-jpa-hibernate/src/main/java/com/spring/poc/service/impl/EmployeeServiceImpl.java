package com.spring.poc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.poc.dao.EmployeeDAO;
import com.spring.poc.model.Employee;
import com.spring.poc.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;

	public List<Employee> getEmployees() {
		return employeeDAO.getEmployees();
	}

	public Employee getEmployee(String code) {
		return employeeDAO.getEmployee(code);
	}

	public void createEmployee(Employee employee) {
		employeeDAO.createEmployee(employee);
	}

	public void updateEmployee(Employee employee) {
		employeeDAO.updateEmployee(employee);
	}

	public void removeEmployee(String code) {
		employeeDAO.removeEmployee(code);
	}

}
