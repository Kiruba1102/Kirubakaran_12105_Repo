package com.pms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pms.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeDAO {
	
	@Autowired
	EntityManager entityManager;
	
	  @Transactional
	    public void save(Employee emp) {
	        entityManager.persist(emp);
	    }
	  
	  
	  public List<Employee> findAll() {
	        return entityManager.createQuery("From Employee", Employee.class).getResultList();
	    }
	
	

}
