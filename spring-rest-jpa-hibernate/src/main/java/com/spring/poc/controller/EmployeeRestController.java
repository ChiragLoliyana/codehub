package com.spring.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.poc.model.Employee;
import com.spring.poc.service.EmployeeService;

@Controller
public class EmployeeRestController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/getEmployeeList", method = RequestMethod.GET)
	@ResponseBody 
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
	
	@RequestMapping(value = "/getEmployee/{code}", method = RequestMethod.GET)
	@ResponseBody
	public Employee getEmployee(@PathVariable("code") String code) {
		return employeeService.getEmployee(code);
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	@ResponseBody
	public void createEmployee(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
	}

	@RequestMapping(value = "/updateEmployee/{code}", method = RequestMethod.PUT)
	@ResponseBody
	public void updateEmployee(@PathVariable("code") String code, @RequestBody Employee employee) {
		if(null != code) {
			Employee existingEmp = employeeService.getEmployee(code);
			if(null != existingEmp) {
				existingEmp.setName(employee.getName());
				existingEmp.setDesignation(employee.getDesignation());
				employeeService.updateEmployee(existingEmp);
			}
		}
	}

	@RequestMapping(value = "/deleteEmployee/{code}", method = RequestMethod.DELETE)
	@ResponseBody
	public void removeEmployee(@PathVariable("code") String code) {
		employeeService.removeEmployee(code);
	}
}
