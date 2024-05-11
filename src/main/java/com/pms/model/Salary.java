package com.pms.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_salary")
public class Salary {

	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int sid;
	    private double yearlyCTC;
	    private double monthlySalary;
	    
	    @OneToOne(targetEntity = Employee.class, cascade = CascadeType.ALL)
	    private Employee employee;

		public Salary() {
			super();
		}

	

		public Salary(int sid, double yearlyCTC, double monthlySalary, Employee employee) {
			super();
			this.sid = sid;
			this.yearlyCTC = yearlyCTC;
			this.monthlySalary = monthlySalary;
			this.employee = employee;
		}

		public int getsid() {
			return sid;
		}

		public void setsid(int sid) {
			this.sid = sid;
		}

		public double getYearlyCTC() {
			return yearlyCTC;
		}

		public void setYearlyCTC(double yearlyCTC) {
			this.yearlyCTC = yearlyCTC;
		}

		public double getMonthlySalary() {
			return monthlySalary;
		}

		public void setMonthlySalary(double monthlySalary) {
			this.monthlySalary = monthlySalary;
		}



		public Employee getEmployee() {
			return employee;
		}

		public void setEmployee(Employee employee) {
			this.employee = employee;
		}
		

}
