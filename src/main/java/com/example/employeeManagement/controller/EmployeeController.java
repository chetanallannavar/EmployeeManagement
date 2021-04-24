package com.example.employeeManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeManagement.request.bean.EmployeeRequestModel;
import com.example.employeeManagement.response.bean.EmployeeResponseModel;
import com.example.employeeManagement.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/insert")
	public EmployeeResponseModel createEmployee(@RequestBody EmployeeRequestModel emp) {
		return null;
      
	}

	@GetMapping("/getemployee{id}")
	public EmployeeRequestModel getEmployee(@PathVariable String id) {
		return null;
	}
}