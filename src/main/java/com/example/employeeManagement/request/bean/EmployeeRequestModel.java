package com.example.employeeManagement.request.bean;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class EmployeeRequestModel {
   @NotNull(message="first Name can't be empty")
	private String firstName;
   @NotNull(message="last Name can't be empty")
	private String lastName;
   @NotNull(message="gender is mandatory")
	private String gender;
   @NotNull(message="status should be added")
	private String status;
	private String bloodgroup;
   @NotNull(message="address is mandatory field ")
	private String address;
	public String getFirstname() {
		return firstName;
	}
	public void setFirstname(String firstname) {
		firstName = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
