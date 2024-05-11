package com.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pms.dao.SalaryDAO;
import com.pms.model.Employee;
import com.pms.model.Salary;
@RestController

public class SalaryController {
	
	private SalaryDAO daoo;

	 public SalaryController(SalaryDAO daoo) {
		super();
		this.daoo = daoo;
	}
	@PostMapping("/salary")
	    public String doInsert(@RequestBody Salary salary) {
	    
	    	String msg="";
	    		try {
					daoo.addSal(salary);
					msg="Object inserted";
				} catch (Exception e) {
					msg="object not inserted";
				}
				return msg;
	    		
	    }
	    @GetMapping("/autopopid")
		public List<Employee> getId() {
			return daoo.idList();
		}
	    
	    
	    @GetMapping("/salfindall")
		public List<Salary> getAll() {
			return daoo.findAll();
			 
		}
}
