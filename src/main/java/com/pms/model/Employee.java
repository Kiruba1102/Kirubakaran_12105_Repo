package com.pms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_employee")
public class Employee {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int eid;
	    private String name;
	    private String bloodGroup;
	    private String address;
	    private String role;

	

		public Employee() {
			super();
		}



		public Employee(int eid, String name, String bloodGroup, String address, String role) {
			super();
			this.eid = eid;
			this.name = name;
			this.bloodGroup = bloodGroup;
			this.address = address;
			this.role = role;
		}



		public int getEid() {
			return eid;
		}



		public void setEid(int eid) {
			this.eid = eid;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getBloodGroup() {
			return bloodGroup;
		}



		public void setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
		}



		public String getAddress() {
			return address;
		}



		public void setAddress(String address) {
			this.address = address;
		}



		public String getRole() {
			return role;
		}



		public void setRole(String role) {
			this.role = role;
		}
		

}
