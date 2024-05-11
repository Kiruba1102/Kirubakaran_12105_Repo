package com.pms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pms.model.Employee;
import com.pms.model.Salary;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class SalaryDAO {

	
	@Autowired
	EntityManager entityManager;
	
	  @Transactional
	    public void addSal(Salary sal) {
	        entityManager.persist(sal);
	    }
	  
	  public List<Salary> findAll() {
	        return entityManager.createQuery("From Salary", Salary.class).getResultList();
	    }
	  
	  public List<Employee> idList(){
		  return entityManager.createQuery("Select eid from Employee", Employee.class).getResultList();
	  }
}
