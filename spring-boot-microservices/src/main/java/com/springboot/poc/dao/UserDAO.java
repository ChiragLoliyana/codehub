package com.springboot.poc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.springboot.poc.schema.User;

@RestResource(path = "userdao", rel = "userdao")
public interface UserDAO extends CrudRepository<User, Long> {

}
