package com.example.employeeManagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.employeeManagement.Util.HelperUtil;
import com.example.employeeManagement.repository.EmployeeRepository;
import com.example.employeeManagement.repository.SrcEmployee;
import com.example.employeeManagement.request.bean.EmployeeRequestModel;
import com.example.employeeManagement.response.bean.EmployeeResponseModel;
import com.example.employeeManagement.service.EmployeeService;
@Component
public class EmployeeServiceImpl implements EmployeeService {
   @Autowired
	EmployeeRepository repo;
	public EmployeeResponseModel insertEmployee(EmployeeRequestModel e) {
		
		SrcEmployee mapEmployeeSrcModel = HelperUtil.mapEmployeeSrcModel(e);
		SrcEmployee save = repo.save(mapEmployeeSrcModel);	
		return HelperUtil.mapEmployeeResModel(save);
	}

}
