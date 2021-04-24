package com.example.employeeManagement.service;

import org.springframework.stereotype.Service;

import com.example.employeeManagement.request.bean.EmployeeRequestModel;
import com.example.employeeManagement.response.bean.EmployeeResponseModel;
@Service
public interface EmployeeService {

	public EmployeeResponseModel  insertEmployee(EmployeeRequestModel e);
}
