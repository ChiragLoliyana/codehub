package com.spring.poc.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.spring.poc.dao.EmployeeDAO;
import com.spring.poc.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Employee> getEmployees() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		query.select(root);
		return entityManager.createQuery(query).getResultList();
	}

	public Employee getEmployee(String code) {
		TypedQuery<Employee> query = entityManager.createQuery("from Employee where code =:code ", Employee.class);
		query.setParameter("code", code);
		return query.getSingleResult();
	}

	public void createEmployee(Employee employee) {
		if(null != employee) {
			entityManager.persist(employee);
		}
	}

	public void updateEmployee(Employee employee) {
		if(null != employee) {
			entityManager.merge(employee);
		}
	}

	public void removeEmployee(String code) {
		if(null != code) {
			entityManager.remove(getEmployee(code));
		}
	}

}
