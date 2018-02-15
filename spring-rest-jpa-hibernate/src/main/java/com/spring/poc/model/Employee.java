package com.spring.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@Column(name = "EMP_CODE", nullable = false)
	private String code;

	@Column(name = "USERNAME", nullable = false)
	private String name;

	@Column(name = "DESIGNATION", nullable = false)
	private String designation;

	public Employee() {
	}
	
	public Employee(String code, String name, String designation) {
		this.code = code;
		this.name = name;
		this.designation = designation;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
