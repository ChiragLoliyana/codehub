package com.springboot.poc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.springboot.poc.schema.Contact;

@RestResource(path = "contactdao", rel = "contactdao")
public interface ContactDAO extends CrudRepository<Contact, Long> {

}
