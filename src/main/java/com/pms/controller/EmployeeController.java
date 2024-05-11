package com.pms.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pms.dao.EmployeeDAO;
import com.pms.model.Employee;

@RestController
@CrossOrigin("http://localhost:3000/")
public class EmployeeController {
	
	private EmployeeDAO dao;
	
	

	public EmployeeController(EmployeeDAO dao) {
		super();
		this.dao = dao;
	}



	@PostMapping("empins")
	public String doInsert(@RequestBody Employee employee) {

		String msg = "";
		try {
			dao.save(employee);
			msg = "Object inserted";
		} catch (Exception e) {
			msg = "Object not inserted";
		}
		return msg;
    }
}
