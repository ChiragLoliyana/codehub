package com.springboot.poc.schema;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsModel {
	private int id;
	
	@NotNull(message = "Name can not be NULL")
	@Size(max = 20, message = "Name must be less than 20 char")
	private String name;
	
	@NotNull(message = "Email can not be NULL")
	@Email
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
